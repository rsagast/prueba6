package com.example.prueba6.response;

import com.example.prueba6.model.Categoria;

import java.util.List;

public class CategoriaResponse {
    private List<Categoria> categoriaList;

    public List<Categoria> getCategoriaList() {
        return categoriaList;
    }

    public void setCategoriaList(List<Categoria> categoriaList) {
        this.categoriaList = categoriaList;
    }
}
