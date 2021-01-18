package com.nv.fileupload.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nv.fileupload.entity.Upload;
import com.nv.fileupload.repo.FileRepository;  
@Service  
public class UploadService   
{  
@Autowired  
FileRepository fileRepository;  
//getting all file records  
public List<Upload> getAllUpload()   
{  
List<Upload> uploads = new ArrayList<Upload>();  
fileRepository.findAll().forEach(upload -> uploads.add(upload));  
return uploads;  
}  
//getting a specific record  
public Upload getUploadById(int id)   
{  
return fileRepository.findById((long) id).get();  
}  
public void saveOrUpdate(Upload upload)   
{  

		
	//fileNameFromDatabase.forEach(upload -> upload.getFileName(fileName));
fileRepository.save(upload);  
}  
//deleting a specific record  
public void delete(int id)   
{  
fileRepository.deleteById((long) id);  
}  
}  

