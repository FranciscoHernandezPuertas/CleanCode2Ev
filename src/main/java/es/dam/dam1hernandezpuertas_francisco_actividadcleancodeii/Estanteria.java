/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.dam.dam1hernandezpuertas_francisco_actividadcleancodeii;

/**
 *
 * @author franh
 */
import java.util.ArrayList;
import java.util.List;

public class Estanteria {
    private int numeroEstanteria;
    private List<Libro> libros;

    public Estanteria(int numeroEstanteria, List<Libro> libros) {
        this.numeroEstanteria = numeroEstanteria;
        this.libros = libros;
    }

    public int getNumeroEstanteria() {
        return numeroEstanteria;
    }

    public void setNumeroEstanteria(int numeroEstanteria) {
        this.numeroEstanteria = numeroEstanteria;
    }

    // Método para añadir un libro a la estantería
    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    // Método para quitar un libro de la estantería
    public void quitarLibro(Libro libro) {
        libros.remove(libro);
    }

    // Método para buscar un libro en la estantería por título
    public Libro buscarLibroPorTitulo(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equals(titulo)) {
                return libro;
            }
        }
        return new Libro(); // Si no se encuentra el libro, devolver un libro por defecto si no se encuentra ninguno.
    }
    
        public static Estanteria estanteriaNoEncontrada() {
        return new Estanteria(-1, new ArrayList<>()); 
    }
}