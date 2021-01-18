package com.nv.fileupload.repo;





//import java.util.List;



import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.nv.fileupload.entity.Upload; 

@Repository
public interface FileRepository extends JpaRepository<Upload, Long>  
{
    //@Query("SELECT fileName FROM Upload WHERE fileName = ?1")
    //List<Upload> findByFileName(String fileName);
	
	
    //Optional<Upload> findByFileName(String firstname);
	
	
	
}  