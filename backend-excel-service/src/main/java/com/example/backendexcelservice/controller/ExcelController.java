package com.example.backendexcelservice.controller;

import com.example.backendexcelservice.entity.Excel;
import com.example.backendexcelservice.service.ExcelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/excel") // Cambia la ruta para la API REST
public class ExcelController {

    @Autowired
    ExcelService excelService;


    @GetMapping("/listar")
    public List<Excel> listar() {
        return excelService.obtenerExamenes();
    }
}