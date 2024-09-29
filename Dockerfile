# Stage 1: Build Stage
FROM ubuntu:latest AS build
RUN apt-get update
RUN apt-get install openjdk-17-jdk maven -y

# Set the working directory inside the container
WORKDIR /app

# Copy the pom.xml first to leverage Docker cache for dependencies
COPY pom.xml .

# Download dependencies (without running the entire build)
RUN mvn dependency:go-offline -B

# Copy the source code
COPY pom.xml .
COPY src ./src

# Build the application
RUN mvn clean package -DskipTests

# Stage 2: Runtime Stage
FROM openjdk:17-jdk-slim
EXPOSE 9191

# Copy the JAR file from the build stage
COPY target/*.jar app.jar

# Run the JAR file
ENTRYPOINT ["java", "-jar", "app.jar"]
