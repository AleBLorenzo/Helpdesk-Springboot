package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Incidencia;
import com.example.demo.service.IncidenciaService;



@RestController
@RequestMapping("/api/incidencia")

public class IncidenciaController {

      private IncidenciaService Incidentervice;

    public IncidenciaController(IncidenciaService Incidentervice) {
        this.Incidentervice = Incidentervice;
    }

 

    

     @GetMapping

     public List<Incidencia> getAllIncidents(){
        
        return  Incidentervice.getAllIncidencias();
        
     }
    

}
