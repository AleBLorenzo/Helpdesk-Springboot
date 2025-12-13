package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Comentario;
import com.example.demo.repository.ComentarioRepository;


@Service

public class ComentarioService {

    @Autowired
    private ComentarioRepository ComentRepo;

    public ComentarioService(ComentarioRepository ComentRepo) {
        this.ComentRepo = ComentRepo;
    }
    
    public List<Comentario> getAllComentarios(){

        return ComentRepo.findAll();
    }
}
