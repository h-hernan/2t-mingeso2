package com.example.backendcuotaservice.model;


import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EstudianteModel {

    @Id
    @Column(name = "Rut")
    private String rut;

    @Column(name = "Nombres")
    private String nombres;

    @Column(name = "Apellidos")
    private String apellidos;

    @Column(name = "Fecha_Nacimiento")
    private String fnacimiento;

    @Column(name = "Tipo_Colegio")
    private String procedencia;

    @Column(name = "Nombre_Colegio")
    private String ncolegio;

    @Column(name = "Año_Egreso")
    private String anoE;

    @Column(name = "Metodo_de_pago")
    private String modalidadpago;

    @Column(name = "Numero_Cuotas", columnDefinition = "int default 1")
    private int ncuotas;

}
