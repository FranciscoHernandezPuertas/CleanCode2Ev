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
public interface BuscadorDeLibros {
    Libro buscarLibro(String titulo);
    List<Libro> buscarLibrosPorAutor(String autor);
}
