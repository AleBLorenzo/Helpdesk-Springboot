package com.example.demo.service;

import java.util.List;
import java.util.Map;

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

        return UserRepo.findById(id).orElse(null);

    }

    public Usuario PostInfo(Usuario usuario) {

        return UserRepo.save(usuario);
    }

    public void DeleteUser(Usuario usuario) {

        UserRepo.delete(usuario);
    }

}
