package com.example.backendestudianteservice.controller;

import com.example.backendestudianteservice.entity.Estudiante;
import com.example.backendestudianteservice.service.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/estudiante")
public class EstudianteController {
    @Autowired
    EstudianteService estudianteService;

    @PostMapping()
    public ResponseEntity<Estudiante> newEstudiante(@RequestBody Estudiante estudiante) {
        estudianteService.save(estudiante);
        return ResponseEntity.ok(estudiante);
    }

    @GetMapping("/")
    public ResponseEntity<List<Estudiante>> listar() {
        List<Estudiante> estudianteEntities = estudianteService.findAll();
        if(estudianteEntities.isEmpty())
            return ResponseEntity.noContent().build();
        return ResponseEntity.ok(estudianteEntities);
    }

    @GetMapping("/{rut}")
    public ResponseEntity<Estudiante> findByRut(@PathVariable("rut") String rut) {
        Estudiante estudianteEntity = estudianteService.findByRut(rut);
        System.out.println(estudianteEntity);
        return ResponseEntity.ok(estudianteEntity);
    }
}