package com.nv.fileupload.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nv.fileupload.entity.Upload;
import com.nv.fileupload.repo.FileRepository;
import com.nv.fileupload.service.UploadService; 
  
@RestController  
public class UploadController   
{  

@Autowired  
UploadService uploadService;
FileRepository fileRepository;

//creating a get mapping that retrieves all the uploads detail from the database   
@GetMapping("/history")  
public List<Upload> getAllUpload()   
{  
return uploadService.getAllUpload();  
}  
//creating a get mapping that retrieves the detail of a specific upload  
@GetMapping("/upload/{file_id}")  
private Upload getUpload(@PathVariable("file_id") int file_id)   
{  
return uploadService.getUploadById(file_id);  
}  
//creating a delete mapping that deletes a specific file  
@DeleteMapping("/upload/{file_id}")  
private void deleteUpload(@PathVariable("file_id") int file_id)   
{  
uploadService.delete(file_id);  
}  
//creating post mapping that post the upload detail in the database  
@PostMapping("/upload") 
private String saveUpload(@RequestBody Upload upload)   
{  	

	//if (fileName == existingFile.)
	

uploadService.saveOrUpdate(upload);  
return upload.getFileName(); 
}  
}  
