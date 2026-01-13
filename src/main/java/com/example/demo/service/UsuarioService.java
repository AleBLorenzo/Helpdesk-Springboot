package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dto.UsuarioRequestDTO;
import com.example.demo.dto.UsuarioResponseDTO;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.Usuario;
import com.example.demo.repository.UsuarioRepository;

@Service

public class UsuarioService {

    @Autowired
    private UsuarioRepository UserRepo;

    public UsuarioService(UsuarioRepository UserRepo) {
        this.UserRepo = UserRepo;
    }

    private Usuario toEntity(UsuarioRequestDTO dto) {

        Usuario u = new Usuario();
        u.setNombre(dto.getNombre());
        u.setEmail(dto.getEmail());
        return u;
    }

    private UsuarioResponseDTO toResponseDTO(Usuario usuario) {

        UsuarioResponseDTO dto = new UsuarioResponseDTO();

        dto.setId(usuario.getId());
        dto.setNombre(usuario.getNombre());
        dto.setEmail(usuario.getEmail());
        return dto;
    }

    public List<UsuarioResponseDTO> getAllUsuarios() {

        return UserRepo.findAll().stream()
                .map(this::toResponseDTO) // mapear cada entity a ResponseDTO
                .toList();
    }

    public UsuarioResponseDTO getIdUsuarios(Long id) {

        Usuario usuario = UserRepo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Usuario no encontrado con id " + id));

        return toResponseDTO(usuario);
    }

    public List<UsuarioResponseDTO> getfindByUsuarios(String nombre, String email) {

        return UserRepo.findByNombreAndEmail(nombre, email)
                .stream()
                .map(this::toResponseDTO)
                .toList();

    }

    public UsuarioResponseDTO PostInfo(UsuarioRequestDTO usuario) {

        if (UserRepo.existsByNombre(usuario.getNombre())) {
            throw new ResourceNotFoundException("Ya existe un usuario con el nombre: " + usuario.getNombre());
        }

        // Convertir RequestDTO → Entity
        Usuario entity = toEntity(usuario);

        // Guardar en base de datos
        Usuario guardado = UserRepo.save(entity);

        // Convertir Entity → ResponseDTO
        return toResponseDTO(guardado);
    }

    @Transactional
    public List<UsuarioResponseDTO> PostAll(List<UsuarioRequestDTO> usuarios) {

        List<UsuarioResponseDTO> guardados = new ArrayList<>();

        for (UsuarioRequestDTO usuario : usuarios) {
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

             Usuario entity = toEntity(usuario);
        Usuario guardado = UserRepo.save(entity);

            guardados.add(toResponseDTO(guardado));
        }

        return guardados;

    }

    public void DeleteUser(Long id) {

        Usuario usuario = UserRepo.findById(id)

                .orElseThrow(() -> new ResourceNotFoundException("Usuario no encontrado con id " + id));
        UserRepo.delete(usuario);
    }
}
