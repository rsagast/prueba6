package com.example.prueba6.model;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Table(name="categoria")
public class Categoria implements Serializable {
    private static final long serialVersionUID=1L;
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nombre;
    private String descricion;

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

    public String getDescricion() {
        return descricion;
    }

    public void setDescricion(String descricion) {
        this.descricion = descricion;
    }
}
