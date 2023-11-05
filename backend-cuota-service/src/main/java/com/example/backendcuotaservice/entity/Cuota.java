package com.example.backendcuotaservice.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "cuotas")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cuota {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cuota")
    private Long idCuota;

    @Column(name = "rut_estudiante")
    private String rutestudiante;

    @Column(name = "fecha_vencimiento", nullable = true)
    private Date fechaVencimiento;

    @Column(name = "valor_cuota")
    private String valorCuota;

    @Column(name = "estado")
    private String estado;

    @Column(name = "fecha_pago", nullable = true)
    private Date fechaPago;
}