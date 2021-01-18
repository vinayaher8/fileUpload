package com.nv.fileupload.entity;
import java.util.Date;


import javax.persistence.Column;  
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;  
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;  
//mark class as an Entity   
@Entity  
//defining class name as Table name  
@Table  
public class Upload   
{  
//mark id as primary key  
@Id  
//defining id as column name  
@Column 
@GeneratedValue
private long fileId;  
//defining name as column name  
@Column ()
private String fileName;  
//defining age as column name  
@Column  
private String fileLocation;  

//defining email as column name  
@Column  
private long ip; 
@Column 
@Temporal(TemporalType.TIMESTAMP)
private  java.util.Date uploadTime;  
//defining email as column name 

@Column  
private long  recordCount;  
//defining email as column name 

@Column  
private boolean fileValidation = true;
//defining email as column name 


public Upload(){
	   super();
	}


public Upload(long fileId, String fileName, String fileLocation, long ip, Date uploadTime, long recordCount,
		boolean fileValidation) {
	this.fileId = fileId;
	this.fileName = fileName;
	this.fileLocation = fileLocation;
	this.ip = ip;
	this.uploadTime = uploadTime;
	this.recordCount = recordCount;
	this.fileValidation = fileValidation;
}


public long getFileId() {
	return fileId;
}





public void setFileId(long fileId) {
	this.fileId = fileId;
}




public String getFileName() {
	return fileName;
}




public void setFileName(String fileName) {
	this.fileName = fileName;
}




public String getFileLocation() {
	return fileLocation;
}




public void setFileLocation(String fileLocation) {
	this.fileLocation = fileLocation;
}




public long getIp() {
	return ip;
}




public void setIp(long ip) {
	this.ip = ip;
}




public java.util.Date getUploadTime() {
	return uploadTime;
}




public void setUploadTime(java.util.Date uploadTime) {
	this.uploadTime = uploadTime;
}




public long getRecordCount() {
	return recordCount;
}




public void setRecordCount(long recordCount) {
	this.recordCount = recordCount;
}




public boolean isFileValidation() {
	return fileValidation;
}




public void setFileValidation(boolean fileValidation) {
	this.fileValidation = fileValidation;
}
@Override
public String toString() {
  return "Tutorial [fileId=" + fileId + ", fileName=" + fileName + ", fileLocation=" + fileLocation + ", ip=" + ip + ", uploadTime=" + uploadTime + ",recordCount=" + recordCount + ",fileValidation=" + fileValidation + "]";
}

}




  