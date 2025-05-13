package com.ejemplo.tiendaMusica.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejemplo.tiendaMusica.repository.ArtistaRepository;
import com.ejemplo.tiendaMusica.model.Artista;

@Service
public class ArtistaService {
    @Autowired
    private ArtistaRepository artistaRepository;

    public List<Artista> listarArtistas()
    {
        return artistaRepository.findAll();
    }
}
