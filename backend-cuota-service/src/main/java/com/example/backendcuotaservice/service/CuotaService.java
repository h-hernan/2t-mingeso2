package com.example.backendcuotaservice.service;

import com.example.backendcuotaservice.entity.Cuota;
import com.example.backendcuotaservice.repository.CuotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class CuotaService {

    @Autowired
    CuotaRepository cuotaRepository;

    public List<Cuota> obtenerTodasLasCuotas() {
        return cuotaRepository.findAll();
    }

    @Transactional
    public void guardarCuotas(List<Cuota> cuotas) {
        cuotaRepository.saveAll(cuotas);
    }

    public List<Cuota> obtenerPorId(String rutestudiante) {
        return cuotaRepository.findByRutestudiante(rutestudiante);
    }

    @Transactional
    public void marcarComoPagado(Long idCuota) {
        Optional<Cuota> cuotabuscada = cuotaRepository.findById(idCuota);
        if (cuotabuscada.isPresent()) {
            Cuota cuota = cuotabuscada.get();
            cuota.setEstado("Pagado");
            cuota.setFechaPago(new Date());
            cuotaRepository.save(cuota);
        }
    }
}