package com.nv.fileupload.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nv.fileupload.entity.History;

import com.nv.fileupload.repo.HistoryRepository;
@Service
public class HistoryService
{
@Autowired
HistoryRepository HistoryRepository;
//getting all history records
public List<History> getAllHistory()
{
List<History> Historys = new ArrayList<History>();
HistoryRepository.findAll().forEach(History -> Historys.add(History));
return Historys;
}
public History getHistoryById(int file_id)   
{  
return HistoryRepository.findById(file_id).get();  
}   
}  