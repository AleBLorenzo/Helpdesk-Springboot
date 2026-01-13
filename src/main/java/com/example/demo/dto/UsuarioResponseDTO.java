package com.example.demo.dto;

public class UsuarioResponseDTO {

    private Long id;
    private String nombre;
    private String email;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setIncidencias(Object incidencias) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setIncidencias'");
    }

}
