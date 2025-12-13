package com.example.demo.service;

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
    
    public List<Incidencia> getAllIncidencias(){

        return InciRepo.findAll();
    }
}
