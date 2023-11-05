package com.example.backendestudianteservice.repository;


import com.example.backendestudianteservice.entity.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface EstudianteRepository extends JpaRepository<Estudiante, String> {
    @Query("select e from Estudiante e where e.rut = :rut")
    Estudiante findByRut(@Param("rut") String rut);
}