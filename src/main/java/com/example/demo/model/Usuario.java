package com.example.demo.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity

public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private Long id;

    @Column(unique = true)
    private String nombre;
    private String email;

    //Especifica q se realiza de uno a muchos de usuario a incidecia
    @OneToMany(mappedBy = "usuario")
    //Le dice al Json q este es el padre para evitar buche
    @JsonManagedReference
    private List<Incidencia> incidencias;


public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public List<Incidencia> getIncidencias() {
        return incidencias;
    }
    public void setIncidencias(List<Incidencia> incidencias) {
        this.incidencias = incidencias;
    }
   
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

    public Usuario orElseThrow(Object object) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'orElseThrow'");
    }




    
}
