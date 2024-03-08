/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.dam.dam1hernandezpuertas_francisco_actividadcleancodeii;

import java.util.ArrayList;

/**
 *
 * @author franh
 */
public class Libro {
    private final String tituloDefault = "";
    private final String autorDefault = "" ;
    private final String ISBNDefault = "";
    private final boolean disponibilidadDefault = false;
    private String titulo;
    private String autor;
    private String ISBN;
    private boolean disponible;

    public Libro(String titulo, String autor, String ISBN, boolean disponible) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.disponible = disponible;
    }
    
    public Libro() {
        this.titulo = tituloDefault;
        this.autor = autorDefault;
        this.ISBN = ISBNDefault;
        this.disponible = disponibilidadDefault;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Libro otroLibro = (Libro) obj;
        return titulo.equals(otroLibro.titulo) && autor.equals(otroLibro.autor) && ISBN.equals(otroLibro.ISBN) && disponible == otroLibro.disponible;
    }

    // Método para marcar el libro como prestado
    public void marcarComoPrestado() {
        disponible = false;
    }

    // Método para marcar el libro como devuelto
    public void marcarComoDevuelto() {
        disponible = true;
    }
}