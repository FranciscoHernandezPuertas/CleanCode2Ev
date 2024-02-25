public class DAM1HernandezPuertas_Francisco_ClasesPrevio {
}
class Empleado {
    // Variables públicas (violando la buena práctica)
    public String nombre;
    public int edad;
    public double salarioActual;

    // Constantes privadas
    private static final int SALARIO_BASE = 50000;
    private static final double BONO = 0.1;

    // Funciones públicas
    public Empleado(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.salarioActual = SALARIO_BASE;
    }

    public void aumentarSalario() {
        // Algoritmo para aumentar el salario
        this.salarioActual *= (1 + BONO);
        notificarAumento();
    }

    // Funciones privadas
    private void notificarAumento() {
        // Lógica de notificación
        System.out.println("El salario ha sido aumentado para " + this.nombre);
    }

    // Violando el principio de responsabilidad única
    public void cambiarDatos(String nuevoNombre, int nuevaEdad) {
        this.nombre = nuevoNombre;
        this.edad = nuevaEdad;
    }
}