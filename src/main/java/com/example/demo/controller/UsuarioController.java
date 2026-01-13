package com.example.demo.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.UsuarioRequestDTO;
import com.example.demo.dto.UsuarioResponseDTO;
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

    public List<UsuarioResponseDTO> getAllUsers() {

        return userservice.getAllUsuarios();

    }

    @GetMapping("/{id}")

    public ResponseEntity<Object> getIdUsers(@PathVariable Long id) {

        UsuarioResponseDTO usuario = userservice.getIdUsuarios(id);
        return ResponseEntity.ok(usuario);

    }

    @GetMapping("/buscar")

    public List<UsuarioResponseDTO> getByUserEmailUsers(@RequestParam String nombre, String email) {

        return userservice.getfindByUsuarios(nombre, email);
    }

    @PostMapping
    public ResponseEntity<UsuarioRequestDTO> postUsers(@RequestBody UsuarioResponseDTO usuario) {

        return userservice.PostInfo(usuario);
    }

    @PostMapping("/lista")
    public ResponseEntity<List<UsuarioResponseDTO>> postListUsers(@RequestBody List<Usuario> usuario) {

        List<UsuarioResponseDTO> guardados = userservice.PostAll(usuario);
        return ResponseEntity.status(HttpStatus.CREATED).body(guardados);

    }

    @PutMapping("/{id}")
    public ResponseEntity<UsuarioResponseDTO> PutUsers(@PathVariable Long id, @RequestBody UsuarioRequestDTO usuarioactualizado) {

        UsuarioResponseDTO userexistente = userservice.getIdUsuarios(id);

        if (userexistente == null) {
            return null;
        }

        if (usuarioactualizado.getNombre() != null) {
            userexistente.setNombre(usuarioactualizado.getNombre());
        }

        if (usuarioactualizado.getEmail() != null) {
            userexistente.setEmail(usuarioactualizado.getEmail());
        }

        if (usuarioactualizado.getIncidencias() != null) {
            userexistente.setIncidencias(usuarioactualizado.getIncidencias());

        }

        UsuarioResponseDTO actualizado = userservice.PostInfo(userexistente);
        return ResponseEntity.ok(actualizado);

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> DeleteUsers(@PathVariable Long id) {

        userservice.DeleteUser(id);

        return ResponseEntity.noContent().build();

    }

}
