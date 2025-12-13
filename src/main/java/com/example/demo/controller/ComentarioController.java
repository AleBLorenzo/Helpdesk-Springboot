package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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

   public Optional<Comentario> getIdComents(@PathVariable Long id) {

      return comentservice.getIdcomentarios(id);

   }

   @PostMapping
   public Comentario postMethodName(@RequestBody Comentario comentario) {

      return comentservice.PostInfo(comentario);
   }
}
