package com.example.backendexcelservice.service;

import com.example.backendexcelservice.entity.Excel;
import com.example.backendexcelservice.repository.ExcelRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@Service
public class ExcelService {

    @Autowired
    ExcelRepository examenRepository;
    public List<Excel> obtenerExamenes(){
        return examenRepository.findAll();
    }

}