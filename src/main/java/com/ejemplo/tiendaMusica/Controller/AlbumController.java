package com.ejemplo.tiendaMusica.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ejemplo.tiendaMusica.model.Album;
import com.ejemplo.tiendaMusica.service.AlbumService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;





@RestController
@RequestMapping("api/albums")
public class AlbumController {
    @Autowired
    private AlbumService albumService;

    @GetMapping
    public ResponseEntity<List<Album>> getAlbums() {
        return new ResponseEntity<>(albumService.listarAlbums(),HttpStatus.OK);
    }
    


    
}
