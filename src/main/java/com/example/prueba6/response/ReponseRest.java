package com.example.prueba6.response;

import java.util.ArrayList;
import java.util.HashMap;

public class ReponseRest {
    private ArrayList<HashMap<String,String>> metadata = new ArrayList<>();

    public ArrayList<HashMap<String, String>> getMetadata() {
        return metadata;
    }

    public void setMetadata(String tipo, String codigo, String valor) {
        HashMap<String,String> mapa = new HashMap<>();
        mapa.put("tipo",tipo);
        mapa.put("codigo",codigo);
        mapa.put("valor",valor);
        this.metadata.add(mapa);
    }
}
