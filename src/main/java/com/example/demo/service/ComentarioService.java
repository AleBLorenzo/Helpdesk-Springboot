package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Comentario;
import com.example.demo.repository.ComentarioRepository;


@Service

public class ComentarioService {


    private ComentarioRepository ComentRepo;
    
    public List<Comentario> getAllComentarios(){

        return ComentRepo.findAll();
    }
}
