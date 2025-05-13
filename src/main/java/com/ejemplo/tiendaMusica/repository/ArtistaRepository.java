package com.ejemplo.tiendaMusica.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ejemplo.tiendaMusica.model.Artista;

@Repository
public interface ArtistaRepository extends JpaRepository<Artista, Integer> {
    
    List<Artista> findAll();

    @SuppressWarnings("unchecked")
    Artista save(Artista artista);
}
