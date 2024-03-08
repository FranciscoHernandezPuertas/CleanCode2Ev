/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package es.dam.dam1hernandezpuertas_francisco_actividadcleancodeii;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author franh
 */
public class DAM1HernandezPuertas_Francisco_ActividadCleanCodeII {

    public static void main(String[] args) {
        // Crear instancias de Libro, Estanteria, Seccion y Usuario
        Libro libro1 = new Libro("Clean Code", "Robert C. Martin", "9780132350884", true);
        Libro libro2 = new Libro("The Pragmatic Programmer", "Andrew Hunt, David Thomas", "9780201616224", true);

        // Crear una lista de libros y añadir los libros a la lista
        List<Libro> librosEnEstanteria = new ArrayList<>();
        librosEnEstanteria.add(libro1);
        librosEnEstanteria.add(libro2);

        // Crear una estantería y pasarle la lista de libros
        Estanteria estanteria1 = new Estanteria(1, librosEnEstanteria);

        // Crear una lista de estanterías y añadir la estantería1 a la lista
        List<Estanteria> estanteriasEnSeccion = new ArrayList<>();
        estanteriasEnSeccion.add(estanteria1);

        // Crear una sección y pasarle la lista de estanterías
        Seccion seccionA = new Seccion("Informática", estanteriasEnSeccion);

        List<Libro> librosPrestados = new ArrayList();
        Usuario usuario1 = new Usuario("Usuario1", 1, librosPrestados);

        // Agregar el libro a la estantería y la estantería a la sección
        estanteria1.agregarLibro(libro1);
        seccionA.agregarEstanteria(estanteria1);
        
        try {
            // Intentar tomar prestado un libro disponible
            usuario1.tomarLibroPrestado(libro1);
            System.out.println("Libro prestado con éxito a " + usuario1.getNombre());
        } catch (RuntimeException e) {
            System.out.println("Error al intentar tomar prestado el libro: " + e.getMessage());
        }

        try {
            // Intentar devolver un libro que el usuario no tiene prestado
            usuario1.devolverLibro(libro2);
            System.out.println("Libro devuelto con éxito por " + usuario1.getNombre());
        } catch (RuntimeException e) {
            System.out.println("Error al intentar devolver el libro: " + e.getMessage());
        }
        
        
        // Buscar un libro por título
        String tituloBuscado = "Clean Code";

        try {
            Libro libroEncontrado = estanteria1.buscarLibroPorTitulo(tituloBuscado);

            if (libroEncontrado != null) {
                System.out.println("Libro encontrado: " + libroEncontrado.getTitulo());
            } else {
                System.out.println("Libro no encontrado con el título: " + tituloBuscado);
            }
        } catch (RuntimeException e) {
            System.out.println("Error al buscar el libro: " + e.getMessage());
        }
    }
}