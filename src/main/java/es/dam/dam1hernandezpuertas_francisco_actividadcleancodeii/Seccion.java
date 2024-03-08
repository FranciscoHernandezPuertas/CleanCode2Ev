/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.dam.dam1hernandezpuertas_francisco_actividadcleancodeii;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author franh
 */
public class Seccion {
    private String nombreSeccion;
    private List<Estanteria> estanterias;

    public Seccion(String nombreSeccion, List<Estanteria> estanterias) {
        this.nombreSeccion = nombreSeccion;
        this.estanterias = estanterias;
    }
    
    public String getNombreSeccion() {
        return nombreSeccion;
    }

    public void setNombreSeccion(String nombreSeccion) {
        this.nombreSeccion = nombreSeccion;
    }

    public List<Estanteria> getEstanterias() {
        return estanterias;
    }

    public void setEstanterias(List<Estanteria> estanterias) {
        this.estanterias = estanterias;
    }
    
    // Método para añadir una estantería a la sección
    public void agregarEstanteria(Estanteria estanteria) {
        estanterias.add(estanteria);
    }

    // Método para quitar una estantería de la sección
    public void quitarEstanteria(Estanteria estanteria) {
        estanterias.remove(estanteria);
    }

    // Método para buscar una estantería en la sección por número
    public Estanteria buscarEstanteriaPorNumero(int numeroEstanteria) {
        for (Estanteria estanteria : estanterias) {
            if (estanteria.getNumeroEstanteria() == numeroEstanteria) {
                return estanteria;
            }
        }
        return Estanteria.estanteriaNoEncontrada(); // Devuelve una estantería especial
    }
}