package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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

  public Incidencia getIdIncidents(@PathVariable Long id) {

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

  public Incidencia postIncident(@RequestBody Incidencia nuevaIncidencia) {

    return Incidentervice.PostInfo(nuevaIncidencia);
  }

  /*
   * Creamos el put lo q hace en este caso es coget una incidencia en Json q
   * incetemos
   * en este caso tiene q tener todo los datos sino sale como null cogemos
   * mediante el id la existente y
   * la modifica con los parametro s qme pasamos
   */

  @PutMapping("/{id}")
  public Incidencia putIncident(@PathVariable Long id, @RequestBody Incidencia incidenciaactualizada) {

    Incidencia incidenciaexistente = Incidentervice.getIdIncidencias(id);

        if (incidenciaexistente == null) {
        return null; 
    }

    if (incidenciaactualizada.getEstado() != null) {
      incidenciaexistente.setEstado(incidenciaactualizada.getEstado());
    }

    if (incidenciaactualizada.getDescripcion() != null) {
      incidenciaexistente.setDescripcion(incidenciaactualizada.getDescripcion());
    }

    if (incidenciaactualizada.getTitulo() != null) {

      incidenciaexistente.setTitulo(incidenciaactualizada.getTitulo());
    }

    if (incidenciaactualizada.getComentarios() != null) {
      incidenciaexistente.setComentarios(incidenciaactualizada.getComentarios());
    }

    if (incidenciaactualizada.getPrioridad() != null) {
      incidenciaexistente.setPrioridad(incidenciaactualizada.getPrioridad());
    }

    if (incidenciaactualizada.getUsuario() != null) {
      incidenciaexistente.setUsuario(incidenciaactualizada.getUsuario());
    }


    return Incidentervice.PostInfo(incidenciaexistente);
  }

  /*
   * Creamos la Delete q es mas sencilla coge el id q le pasemos y si existe lo
   * elimina y de da un mensaje y
   * si no existe te saca el mesnaje q no existe y no hace nada
   */

  @DeleteMapping("/{id}")
  public String DeleteIncidents(@PathVariable long id) {

    Incidencia incidencia = Incidentervice.getIdIncidencias(id);

    if (incidencia == null) {
      return "No existe esa incidencia";

    }
    Incidentervice.DeleteIncidencias(incidencia);
    return "Incidencia eliminada";

  }

}
