package com.thvfuturistai.LeelaCasting.Entity;

import java.sql.Date;

import org.antlr.v4.runtime.misc.NotNull;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Data
@Entity
@SuppressWarnings({ "serial"})
@Table (name="dailytransactions")
public class DialyTransactions extends BaseDialyTransactions{
	
	
}
