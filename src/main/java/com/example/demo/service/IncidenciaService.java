package com.example.demo.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Incidencia;
import com.example.demo.repository.IncidenciaRepository;

@Service

public class IncidenciaService {

    @Autowired
    private IncidenciaRepository InciRepo;

    public IncidenciaService(IncidenciaRepository InciRepo) {
        this.InciRepo = InciRepo;
    }

    public List<Incidencia> getAllIncidencias() {

        return InciRepo.findAll();
    }

    public Incidencia getIdIncidencias(Long id) {

        return InciRepo.findById(id).orElse(null);

    }

    /*
     * Creamos el metodo PostInfo q venga de incidecia ya q sera un objeto
     * ya q lo haremon en Json podemos antes de hacerlo establecer valores
     * predeterminado
     * en este caso la fecha para no introducirla manul sde crea automatico cada ves
     * q hacemos el post
     * y con el metodo q viene save lo guardamos
     */

    public Incidencia PostInfo(Incidencia incidencia) {
        incidencia.setFecha_creacion(LocalDateTime.now());
        return InciRepo.save(incidencia);
    }

    public void DeleteIncidencias(Incidencia incidencia) {

        InciRepo.delete(incidencia);
    }
}
