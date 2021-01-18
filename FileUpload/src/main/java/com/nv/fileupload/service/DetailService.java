package com.nv.fileupload.service;
   import java.util.ArrayList;  
    import java.util.List;  
    import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nv.fileupload.entity.Detail;
import com.nv.fileupload.repo.DetailRepository;  
@Service  
    public class DetailService   
    {  
    @Autowired  
    DetailRepository detailRepository;  
    //getting all  records  
    public List<Detail> getAllDetail()   
    {  
    List<Detail> details = new ArrayList<Detail>();  
    detailRepository.findAll().forEach(detail -> details.add(detail));  
    return details;  
    }  
    //getting a specific record  
    public Detail getDetailById(int id)   
    {  
    return detailRepository.findById((long) id).get();  
    }  
    public void saveOrUpdate(Detail detail)   
    {  
    	detailRepository.save(detail);  
    }  
   
    }  