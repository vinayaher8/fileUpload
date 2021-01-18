package com.nv.fileupload.entity;
import javax.persistence.Column;  
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;  
import javax.persistence.Table;  
//mark class as an Entity   
@Entity  
//defining class name as Table name  
@Table  
public class Detail   
{  
//mark id as primary key  
@Id  
@GeneratedValue(strategy = GenerationType.AUTO)
private long id;  
  
@Column  
private long amount;  

@Column
private long cardnumber;
 
@Column  
private String trantype;  

@Column  
private String merchantdetail;  


public Detail(long id, long amount, long cardnumber, String trantype, String merchantdetail) {
	super();
	this.id = id;
	this.amount = amount;
	this.cardnumber = cardnumber;
	this.trantype = trantype;
	this.merchantdetail = merchantdetail;
	
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public long getAmount() {
	return amount;
}
public void setAmount(long amount) {
	this.amount = amount;
}
public String getTrantype() {
	return trantype;
}
public void setTrantype(String trantype) {
	this.trantype = trantype;
}
public String getMerchantdetail() {
	return merchantdetail;
}
public void setMerchantdetail(String merchantdetail) {
	this.merchantdetail = merchantdetail;
}
public long getCardnumber() {
	return cardnumber;
}
public void setCardnumber(long cardnumber) {
	this.cardnumber = cardnumber;
}
}