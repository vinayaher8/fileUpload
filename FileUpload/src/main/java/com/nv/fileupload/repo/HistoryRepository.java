package com.nv.fileupload.repo;

import org.springframework.data.repository.CrudRepository;

import com.nv.fileupload.entity.History;  
public interface HistoryRepository extends CrudRepository<History, Integer>  
{  
}  