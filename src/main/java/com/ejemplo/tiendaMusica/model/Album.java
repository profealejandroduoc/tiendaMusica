package com.ejemplo.tiendaMusica.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="album")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Album {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 250,nullable = false)
    private String titulo;

    @ManyToOne
    @JoinColumn(referencedColumnName = "id")
    private Artista artista;


}
