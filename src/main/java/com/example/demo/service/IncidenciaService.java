package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Incidencia;
import com.example.demo.repository.IncidenciaRepository;


@Service

public class IncidenciaService {

    private IncidenciaRepository InciRepo;
    
    public List<Incidencia> getAllIncidencias(){

        return InciRepo.findAll();
    }
}
