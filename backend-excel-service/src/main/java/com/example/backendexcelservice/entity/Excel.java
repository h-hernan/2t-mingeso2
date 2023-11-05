package com.example.backendexcelservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "examen")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Excel {
    @Id
    @Column(name = "rut_estudiante")
    private String rut_de_estudiante;

    @Column(name = "fecha_examen")
    private Date fechaExamen;

    @Column(name = "Puntaje")
    private int puntaje;

}