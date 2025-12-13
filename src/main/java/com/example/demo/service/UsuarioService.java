package com.example.demo.service;

import java.util.List;

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

    public Usuario getIdUsuarios(Long id) {

        return UserRepo.findById(id).orElse(null);

    }

    public Usuario PostInfo(Usuario usuario) {

        return UserRepo.save(usuario);
    }

    public void DeleteUser(Usuario usuario) {

        UserRepo.delete(usuario);
    }

}
