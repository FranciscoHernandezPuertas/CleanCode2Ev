/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package es.dam.dam1hernandezpuertas_francisco_actividadcleancodeii;

import java.util.List;

/**
 *
 * @author franh
 */
public interface GestorDePrestamos {
    boolean prestarLibro(Usuario usuario, Libro libro);
    boolean devolverLibro(Usuario usuario, Libro libro);
    List<Libro> obtenerLibrosPrestados(Usuario usuario);
}