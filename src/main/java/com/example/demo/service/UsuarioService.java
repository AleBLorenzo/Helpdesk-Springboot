package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Usuario;
import com.example.demo.repository.UsuarioRepository;

@Service

public class UsuarioService {

    private UsuarioRepository UserRepo;
    
    public List<Usuario> getAllUsuarios(){

        return UserRepo.findAll();
    }


}
