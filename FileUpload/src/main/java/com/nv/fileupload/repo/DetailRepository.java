package com.nv.fileupload.repo;

  
import org.springframework.data.jpa.repository.JpaRepository;

import com.nv.fileupload.entity.Detail;  

public interface DetailRepository extends JpaRepository<Detail, Long> 
{  
}  