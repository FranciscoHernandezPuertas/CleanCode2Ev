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

public class Usuario {
    private String nombre;
    private int id;
    private List<Libro> librosPrestados;

    public Usuario(String nombre, int id, List<Libro> librosPrestados) {
        this.nombre = nombre;
        this.id = id;
        this.librosPrestados = librosPrestados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Libro> getLibrosPrestados() {
        return librosPrestados;
    }

    public void setLibrosPrestados(List<Libro> librosPrestados) {
        this.librosPrestados = librosPrestados;
    }

    // Método para tomar un libro prestado
    public void tomarLibroPrestado(Libro libro) {
        if (libro != null && libro.isDisponible()) {
            librosPrestados.add(libro);
            libro.marcarComoPrestado();
        } else {
            throw new RuntimeException("El libro no está disponible para préstamo");
        }
    }

    // Método para devolver un libro prestado
    public void devolverLibro(Libro libro) {
        if (libro != null && librosPrestados.contains(libro)) {
            librosPrestados.remove(libro);
            libro.marcarComoDevuelto();
        } else {
            throw new RuntimeException("El usuario no tiene este libro prestado");
        }
    }
}