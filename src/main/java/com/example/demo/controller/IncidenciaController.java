package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

  public List<Incidencia> getAllIncidents() {

    return Incidentervice.getAllIncidencias();

  }

  @GetMapping("/{id}")

  public Optional<Incidencia> getIdIncidents(@PathVariable Long id) {

    return Incidentervice.getIdIncidencias(id);

  }

  /*
   * Creamos el POST para introducir Informacion
   * la mejor forma de hacerlo es mediante JSON
   * utilizamos RequestBody ya q perimte agregar headers controlar erroes ect
   * llamamos al metodo de PostInfo y la incidencia en este caso la
   * creamos en Json y la ponemos en Postman
   */
  @PostMapping

  public Incidencia postMethodName(@RequestBody Incidencia nuevaIncidencia) {

    return Incidentervice.PostInfo(nuevaIncidencia);
  }

}
