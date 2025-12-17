package com.example.demo.service;

import java.time.LocalDateTime;
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

    public List<Comentario> getAllComentarios() {

        return ComentRepo.findAll();
    }

    public Comentario getIdcomentarios(Long id) {

        return ComentRepo.findById(id).orElse(null);

    }

    public Comentario PostInfo(Comentario comentario) {
        comentario.setFecha(LocalDateTime.now());
        return ComentRepo.save(comentario);
    }

    public void DeleteComentarios(Comentario comentario) {

        ComentRepo.delete(comentario);
    }
}
