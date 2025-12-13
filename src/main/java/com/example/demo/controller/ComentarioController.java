package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
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

     public List<Comentario> getAllUComents(){
        
        return  comentservice.getAllComentarios();
        
     }
}
