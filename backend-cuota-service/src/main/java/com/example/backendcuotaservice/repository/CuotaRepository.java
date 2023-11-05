package com.example.backendcuotaservice.repository;


import com.example.backendcuotaservice.entity.Cuota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CuotaRepository extends JpaRepository <Cuota, Long> {

    public List<Cuota> findByRutestudiante(String rutestudiante);

}