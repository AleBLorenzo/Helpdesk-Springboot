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

import com.example.demo.model.Comentario;
import com.example.demo.service.ComentarioService;

@RestController
@RequestMapping("/api/comentario")

public class ComentarioController {

   private ComentarioService comentservice;

   public ComentarioController(ComentarioService comentservice) {
      this.comentservice = comentservice;
   }

   @GetMapping

   public List<Comentario> getAllComents() {

      return comentservice.getAllComentarios();

   }

   @GetMapping("/{id}")

   public Comentario getIdComents(@PathVariable Long id) {

      return comentservice.getIdcomentarios(id);

   }

   @PostMapping
   public Comentario postComents(@RequestBody Comentario comentario) {

      return comentservice.PostInfo(comentario);
   }

   @PutMapping("/{id}")
   public Comentario putComents(@PathVariable Long id, @RequestBody Comentario comentarioactualizado) {

      Comentario comentarioexistente = comentservice.getIdcomentarios(id);

      if (comentarioexistente == null) {
         return null;
      }

      if (comentarioactualizado.getContenido() != null) {
         comentarioexistente.setContenido(comentarioactualizado.getContenido());
      }
      if (comentarioactualizado.getIncidencia() != null) {
         comentarioexistente.setIncidencia(comentarioactualizado.getIncidencia());
      }
      if (comentarioactualizado.getUsuario() != null) {
         comentarioexistente.setUsuario(comentarioactualizado.getUsuario());
      }

      return comentservice.PostInfo(comentarioexistente);
   }

   @DeleteMapping("/{id}")
   public String deteleComents(@PathVariable Long id) {

      Comentario comentario = comentservice.getIdcomentarios(id);

      if (comentario == null) {
         return "No existe ese comentario";
      }

      comentservice.DeleteComentarios(comentario);

      return "Comentario eliminado";
   }
}
