package com.nv.fileupload.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.nv.fileupload.entity.History;
import com.nv.fileupload.service.HistoryService;
  
@RestController  
public class Historycontroller   
{  

@Autowired  
HistoryService HistoryService;  
//creating a get mapping that retrieves all the history detail from the database   
@GetMapping("/history1") 
public List<History> getALLHistroy()   
{  
return HistoryService.getAllHistory();
}  
@GetMapping("/search/{file_id}")  
private History getHistory(@PathVariable("file_id") int file_id)   
{  
	return HistoryService.getHistoryById(file_id); 
} 
}  

