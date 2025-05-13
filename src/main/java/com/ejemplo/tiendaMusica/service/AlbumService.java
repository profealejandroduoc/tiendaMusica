package com.ejemplo.tiendaMusica.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejemplo.tiendaMusica.model.Album;
import com.ejemplo.tiendaMusica.repository.AlbumRepository;

@Service
public class AlbumService {
    @Autowired
    private AlbumRepository albumRepository;


    public List<Album> listarAlbums()
    {
        return albumRepository.findAll();
    }


    public Album guardarAlbum(Album album)
    {
        return albumRepository.save(album);
    }

}
