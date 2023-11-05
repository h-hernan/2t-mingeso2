package com.example.backendcuotaservice.controller;

import com.example.backendcuotaservice.entity.Cuota;
import com.example.backendcuotaservice.service.CuotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cuota")
public class CuotaController {

    @Autowired
    CuotaService cuotaService;

    @GetMapping("/formulario")
    public Cuota mostrarformulario() { // Cambia el tipo de retorno a Cuota
        return new Cuota();
    }

    @PostMapping("/actualizarEstadoCuota")
    public void actualizarEstadoCuota(@RequestParam Long idCuota) {
        cuotaService.marcarComoPagado(idCuota);
    }

    @GetMapping("/listar2")
    public List<Cuota> listarCuotas2(@RequestParam String rutestudiante) {
        return cuotaService.obtenerPorId(rutestudiante);
    }

    @GetMapping("/listar")
    public List<Cuota> listarCuotas() {
        return cuotaService.obtenerTodasLasCuotas();
    }
}