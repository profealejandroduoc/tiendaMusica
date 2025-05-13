package com.ejemplo.tiendaMusica.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ejemplo.tiendaMusica.model.Album;

@Repository
public interface AlbumRepository extends JpaRepository<Album,Integer> {
    
}
