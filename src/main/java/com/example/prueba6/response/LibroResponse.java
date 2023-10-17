package com.example.prueba6.response;

import com.example.prueba6.model.Libro;

import java.util.List;

public class LibroResponse {
    private List<Libro> libroList;

    public List<Libro> getLibroList() {
        return libroList;
    }

    public void setLibroList(List<Libro> libroList) {
        this.libroList = libroList;
    }
}
