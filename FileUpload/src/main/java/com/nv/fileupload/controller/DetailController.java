package com.nv.fileupload.controller;

import java.util.List;  

import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.web.bind.annotation.GetMapping;    
import org.springframework.web.bind.annotation.PostMapping;  
import org.springframework.web.bind.annotation.RequestBody;  
import org.springframework.web.bind.annotation.RestController;

import com.nv.fileupload.entity.Detail;
import com.nv.fileupload.service.DetailService;  
//creating RestController  
@RestController  
public class DetailController   
{  
//autowired the Service class  
@Autowired  
DetailService detailService;  
//creating a get mapping that retrieves all the detail from the database   
@GetMapping("/detail")  
private List<Detail> getAllDetail()   
{  
return detailService.getAllDetail();  
}  
//creating a get mapping that retrieves the detail of a specific file  



//creating post mapping that post the detail in the database  
@PostMapping("/postdetail")  
private long saveDetail(@RequestBody Detail detail)   
{  
detailService.saveOrUpdate(detail);  
return detail.getId();  
}  
}  