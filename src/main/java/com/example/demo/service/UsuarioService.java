package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Usuario;
import com.example.demo.repository.UsuarioRepository;

@Service

public class UsuarioService {

    @Autowired
    private UsuarioRepository UserRepo;

    public UsuarioService(UsuarioRepository UserRepo) {
        this.UserRepo = UserRepo;
    }

    public List<Usuario> getAllUsuarios() {

        return UserRepo.findAll();
    }

    public Optional<Usuario> getIdUsuarios(Long id) {

        return UserRepo.findById(id);

    }

    public Usuario PostInfo(Usuario usuario) {

        return UserRepo.save(usuario);
    }

}
