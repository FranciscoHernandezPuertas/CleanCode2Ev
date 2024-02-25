public class DAM1HernandezPuertas_Francisco_ClasesNuevo {
}
class Empleado {
    // Constantes privadas
    private static final int SALARIO_BASE = 50000;
    private static final double BONO = 0.1;

    // Variables privadas
    private String nombre;
    private int edad;
    private double salarioActual;

    // Constructor
    public Empleado(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.salarioActual = SALARIO_BASE;
    }

    // Funciones públicas
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

    // Constructor de copia
    public Empleado(Empleado original) {
        this.nombre = original.nombre;
        this.edad = original.edad;
        this.salarioActual = original.salarioActual;
    }
}