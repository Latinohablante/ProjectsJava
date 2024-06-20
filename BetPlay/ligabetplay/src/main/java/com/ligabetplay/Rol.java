package com.ligabetplay;

import java.util.List;

public class Rol {
    private Long id;
    private String nombre;
    private List<Permiso> permisos;

    // Getters y setters
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public List<Permiso> getPermisos() {
        return permisos;
    }
    public void setPermisos(List<Permiso> permisos) {
        this.permisos = permisos;
    }

    // Getters y setters

    
}
