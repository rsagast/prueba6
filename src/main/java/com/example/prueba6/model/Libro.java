package com.example.prueba6.model;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Table(name="libro")
public class Libro implements Serializable {
    private static final long serialVersionID = 1L;
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nombre;
    private String descripcion;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
