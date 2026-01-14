package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

    public Usuario PathUsuarios(Long id , Map<String, String> updates) {

        Usuario usuario = null;

        try {

          usuario = UserRepo.findById(id).orElse(null);

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        if (updates.containsKey("nombre")) {

            usuario.setNombre(updates.get("nombre"));
            
        } 
        
        if (updates.containsKey("email")){

            usuario.setEmail(updates.get("email"));
        }


        return UserRepo.save(usuario);
    }

    public Usuario getIdUsuarios(Long id) {

        return UserRepo.findById(id).orElseThrow(() -> new RuntimeException("Producto no encontrado"));

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

    @Transactional
    public List<Usuario> PostAll(List<Usuario> usuarios) {

        List<Usuario> guardados = new ArrayList<>();

        for (Usuario usuario : usuarios) {
            // Validación simple
            if (usuario.getNombre() == null || usuario.getNombre().isBlank()) {
                throw new RuntimeException("El nombre no puede estar vacío");
            }

            // Simulación de error artificial
            if ("ERROR".equalsIgnoreCase(usuario.getNombre())) {
                throw new RuntimeException("Valor prohibido detectado");
            }

            // Verificar si el usuario ya existe por nombre o email
            if (UserRepo.existsByNombre(usuario.getNombre())) {
                throw new RuntimeException("Ya existe un usuario con el nombre: " + usuario.getNombre());
            }

            Usuario guardado = UserRepo.save(usuario);
            guardados.add(guardado);
        }

        return guardados;

    }

    public void DeleteUser(Usuario usuario) {

        UserRepo.delete(usuario);
    }

}
