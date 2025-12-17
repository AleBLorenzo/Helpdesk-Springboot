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

    public List<Usuario> getfindByUsuarios(String nombre, String email) {

        return UserRepo.findByNombreAndEmail(nombre, email);

    }

    public Usuario PostInfo(Usuario usuario) {

        try {

            if (!UserRepo.existsByNombre(usuario.getNombre())) {

                return UserRepo.save(usuario);
            }

        } catch (RuntimeException e) {

            System.out.println("Ya existe");

        }

        return usuario;

    }

    public void DeleteUser(Usuario usuario) {

        UserRepo.delete(usuario);
    }

}
