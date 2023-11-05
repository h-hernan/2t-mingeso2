package com.example.backendestudianteservice.service;

import com.example.backendestudianteservice.entity.Estudiante;
import com.example.backendestudianteservice.repository.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class EstudianteService {
    @Autowired
    EstudianteRepository estudianteRepository;

    public void save(Estudiante estudianteEntity){
        estudianteRepository.save(estudianteEntity);
    }

    public List<Estudiante> findAll(){
        return estudianteRepository.findAll();
    }

    public Estudiante findByRut(String rut){
        return estudianteRepository.findByRut(rut);
    }

}