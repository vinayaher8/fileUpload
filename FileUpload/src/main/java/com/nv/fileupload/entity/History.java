package com.nv.fileupload.entity;

import javax.persistence.Column;  
import javax.persistence.Entity;  
import javax.persistence.Id;  
import javax.persistence.Table;  
//mark class as an Entity   
@Entity  
//defining class name as Table name  
@Table  
public class History  
{  
//mark id as primary key  
@Id  
//defining id as column name  
@Column  
private int sr_no;  
//defining sr_no as column name  
@Column  
private String name_of_file;  
//defining name_of_file as column name  
@Column  
private int number_of_records;  
//defining number_of_records as column name  
@Column  
private int sucessful_records; 
//defining sucessful_records as column name
@Column 
private  int filed_records;  
//defining filed_records as column name 

public int getsr_no() {
	return sr_no;
}

public void setSr_no(int sr_no) {
	this.sr_no = sr_no;
}

public String name_of_file() {
	return name_of_file;
}

public void setName_of_file(String name_of_file) {
	this.name_of_file =name_of_file;
}

public int getNumber_of_records() {
	return number_of_records;
}

public void setNumber_of_records(int number_of_records) {
	this.number_of_records = number_of_records;
}

public int getSucessful_records() {
	return sucessful_records;
}

public void setSucessful_records(int sucessful_records) {
	this.sucessful_records = sucessful_records;
}

public int getFiled_records() {
	return filed_records;
}

public void setFiled_records(int filed_records) {
	this.filed_records = filed_records;
}
}