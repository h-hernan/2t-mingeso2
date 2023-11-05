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
        /*
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate NewFechaNacimiento = LocalDate.parse(fecha_nacimiento, formato);
        LocalDate NewAnioEgreso = LocalDate.parse(anio_egreso, formato);
        System.out.println(rut + "  " + nombres + "  " + apellidos + "  " + fecha_nacimiento + "  " + tipo_colegio + "  " + nombre_colegio + "  " + anio_egreso);
        int idTipoColegio = estudianteService.findIdByTipo(tipo_colegio);
        LocalDate anio_ingreso = LocalDate.now();
        EstudianteEntity estudianteEntity = new EstudianteEntity(rut, nombres, apellidos, NewFechaNacimiento, idTipoColegio, nombre_colegio, NewAnioEgreso, anio_ingreso);
        estudianteService.save(estudianteEntity);
        return ResponseEntity.ok(estudianteEntity);
         */
        estudianteService.save(estudiante);
        return ResponseEntity.ok(estudiante);
    }

    @GetMapping("/")
    public ResponseEntity<List<Estudiante>> listar() {
        List<Estudiante> estudianteEntities = estudianteService.findAll();
        return ResponseEntity.ok(estudianteEntities);
    }

    @GetMapping("/{rut}")
    public ResponseEntity<Estudiante> findByRut(@PathVariable("rut") String rut) {
        Estudiante estudianteEntity = estudianteService.findByRut(rut);
        System.out.println(estudianteEntity);
        return ResponseEntity.ok(estudianteEntity);
    }
}