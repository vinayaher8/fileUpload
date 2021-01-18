package com.nv.fileupload.service;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import com.nv.fileupload.entity.Detail;
import com.nv.fileupload.repo.DetailRepository;

@Service
public class CSVService {
	  @Autowired
	  DetailRepository repository;

	 
	  

	  public List<Detail> getAlldetails() {
	    return repository.findAll();
	  }
}
