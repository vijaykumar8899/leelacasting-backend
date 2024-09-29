package com.thvfuturistai.LeelaCasting.Entity;

import java.sql.Date;

import org.antlr.v4.runtime.misc.NotNull;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;


@SuppressWarnings({ "serial"})
@MappedSuperclass 
public abstract class BaseDialyTransactions {
	public static final String FIELD_dailyTransaction = "dailyTransactionsId";
	public static final String FIELD_generatedBarCode = "generatedBarCode";
	public static final String FIELD_name = "name";
	public static final String FIELD_phoneNumber = "phoneNumber";
	public static final String FIELD_city = "city";
	public static final String FIELD_quantity = "quantity";
	public static final String FIELD_advanceGold = "advanceGold";
	public static final String FIELD_ornamentWeight = "ornamentWeight";
	public static final String FIELD_pendingGold = "pendingGold";
	public static final String FIELD_payables = "payables";
	public static final String FIELD_receivables = "receivables";
	public static final String FIELD_active = "active";
	public static final String FIELD_transactionClosed = "transactionClosed";
	public static final String FIELD_createdBy = "createdBy";
	public static final String FIELD_createdDate = "createdDate";
	public static final String FIELD_lastUpdatedBy = "lastUpdatedBy";
	public static final String FIELD_lastUpdatedTs = "lastUpdatedTs";

	private Long dailyTransactionsId;
	private String generatedBarCode;
	private String name;
	private String phoneNumber;
	private String city;
	private Integer quantity;
	private Double advanceGold;
	private Double ornamentWeight;
	private Double pendingGold;
	private Character payables;
	private Character receivables;
	private Character active;
	private Character transactionClosed;
	private String createdBy;
	private Date createdDate;
	private String lastUpdatedBy;
	private Date lastUpdatedTs;

	
	@Id
 	@Column(name = "daily_transactions_id") 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getDailyTransactionsId() {
		return dailyTransactionsId;
	}
	public void setDailyTransactionsId(Long dailyTransactionsId) {
		this.dailyTransactionsId = dailyTransactionsId;
	}
	
	public void setGeneratedBarCode( String  _generatedBarCode){
		this.generatedBarCode = _generatedBarCode;
	}
	@Column (name="generated_bar_code")
	public String getGeneratedBarCode(){
		 return this.generatedBarCode;
	}
	public void setName( String  _name){
		this.name = _name;
	}
	@Column (name="name")
	public String getName(){
		 return this.name;
	}
	public void setPhoneNumber( String  _phoneNumber){
		this.phoneNumber = _phoneNumber;
	}
	@Column (name="phone_number")
	public String getPhoneNumber(){
		 return this.phoneNumber;
	}
	public void setCity( String  _city){
		this.city = _city;
	}
	@Column (name="city")
	public String getCity(){
		 return this.city;
	}
	public void setQuantity( Integer  _quantity){
		this.quantity = _quantity;
	}
	@Column (name="quantity")
	public Integer getQuantity(){
		 return this.quantity;
	}
	public void setAdvanceGold( Double  _advanceGold){
		this.advanceGold = _advanceGold;
	}
	@Column (name="advance_gold")
	public Double getAdvanceGold(){
		 return this.advanceGold;
	}
	public void setOrnamentWeight( Double  _ornamentWeight){
		this.ornamentWeight = _ornamentWeight;
	}
	@Column (name="ornament_weight")
	public Double getOrnamentWeight(){
		 return this.ornamentWeight;
	}
	public void setPendingGold( Double  _pendingGold){
		this.pendingGold = _pendingGold;
	}
	@Column (name="pendingGold")
	public Double getPendingGold(){
		 return this.pendingGold;
	}
	public void setPayables( Character  _payables){
		this.payables = _payables;
	}
	@NotNull 
	@Column (name="payables")
	public Character getPayables(){
		 return this.payables;
	}
	public void setReceivables( Character  _receivables){
		this.receivables = _receivables;
	}
	@NotNull 
	@Column (name="receivables")
	public Character getReceivables(){
		 return this.receivables;
	}
	public void setActive( Character  _active){
		this.active = _active;
	}
	@NotNull 
	@Column (name="active")
	public Character getActive(){
		 return this.active;
	}
	public void setTransactionClosed( Character  _transactionClosed){
		this.transactionClosed = _transactionClosed;
	}
	@NotNull 
	@Column (name="transaction_closed")
	public Character getTransactionClosed(){
		 return this.transactionClosed;
	}
	public void setCreatedBy( String  _createdBy){
		this.createdBy = _createdBy;
	}
	
	@Column (name="created_by")
	public String getCreatedBy(){
		 return this.createdBy;
	}
	public void setCreatedDate( Date  _createdDate){
		this.createdDate = _createdDate;
	}
	@Column (name="created_date")
	public Date getCreatedDate(){
		 return this.createdDate;
	}

	

	
//	public String toString(){
//		StringBuilder str = new StringBuilder();
//		str.append("dailyTransaction = " + dailyTransaction + "\n");
//;
//		str.append("generatedBarCode = " + generatedBarCode + "\n");
//		str.append("name = " + name + "\n");
//		str.append("phoneNumber = " + phoneNumber + "\n");
//		str.append("city = " + city + "\n");
//		str.append("quantity = " + quantity + "\n");
//		str.append("advanceGold = " + advanceGold + "\n");
//		str.append("ornamentWeight = " + ornamentWeight + "\n");
//		str.append("pendingGold = " + pendingGold + "\n");
//		str.append("payables = " + payables + "\n");
//		str.append("receivables = " + receivables + "\n");
//		str.append("active = " + active + "\n");
//		str.append("transactionClosed = " + transactionClosed + "\n");
//		str.append("createdBy = " + createdBy + "\n");
//		str.append("createdDate = " + createdDate + "\n");
//		str.append("lastUpdatedBy = " + lastUpdatedBy + "\n");
//		str.append("lastUpdatedTs = " + lastUpdatedTs + "\n");
//		return str.toString();
//	}

}
