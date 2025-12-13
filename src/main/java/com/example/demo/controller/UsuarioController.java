package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Usuario;
import com.example.demo.service.UsuarioService;

@RestController
@RequestMapping("/api/usuario")

public class UsuarioController {

    private UsuarioService userservice;

    public UsuarioController(UsuarioService userservice) {
        this.userservice = userservice;
    }

    @GetMapping

    public List<Usuario> getAllUsers() {

        return userservice.getAllUsuarios();

    }

    @GetMapping("/{id}")

    public Optional<Usuario> getIdUsers(@PathVariable Long id) {

        return userservice.getIdUsuarios(id);

    }

    @PostMapping
    public Usuario postMethodName(@RequestBody Usuario usuario) {

        return userservice.PostInfo(usuario);
    }

}
