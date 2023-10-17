package com.example.prueba6.response;

public class CategoriaResponseRest extends ReponseRest{
    private CategoriaResponse categoriaResponse = new CategoriaResponse();

    public CategoriaResponse getCategoriaResponse() {
        return categoriaResponse;
    }

    public void setCategoriaResponse(CategoriaResponse categoriaResponse) {
        this.categoriaResponse = categoriaResponse;
    }
}
