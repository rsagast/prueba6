package com.example.prueba6.model.dao;

import com.example.prueba6.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICategoria extends JpaRepository<Categoria,Long> {
}
