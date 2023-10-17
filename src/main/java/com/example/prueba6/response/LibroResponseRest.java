package com.example.prueba6.response;

public class LibroResponseRest extends ReponseRest{
    private LibroResponse libroResponse = new LibroResponse();

    public LibroResponse getLibroResponse() {
        return libroResponse;
    }

    public void setLibroResponse(LibroResponse libroResponse) {
        this.libroResponse = libroResponse;
    }
}
