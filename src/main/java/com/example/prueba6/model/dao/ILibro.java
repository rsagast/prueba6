package com.example.prueba6.model.dao;

import com.example.prueba6.model.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ILibro extends JpaRepository<Libro,Long> {
}
