package com.ejemplo.tiendaMusica.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ejemplo.tiendaMusica.model.Artista;
import com.ejemplo.tiendaMusica.service.ArtistaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




@RestController
@RequestMapping("api/artistas")
public class ArtistaController {
    @Autowired
    private ArtistaService artistaService;


    @GetMapping
    public ResponseEntity<List<Artista>> getArtistas() {
        return new ResponseEntity<>(artistaService.listarArtistas(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Artista> postArtista(@RequestBody Artista artista) {

        
        return new ResponseEntity<>(artistaService.guardarArtista(artista), HttpStatus.OK);
    }
    
    



}
