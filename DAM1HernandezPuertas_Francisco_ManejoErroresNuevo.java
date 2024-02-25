public class DAM1HernandezPuertas_Francisco_ManejoErroresNuevo {
    public static void main(String[] args) {
        try {
            // Llamada a una función que puede lanzar una excepción
            int result = divide(10, 0);
            
            // Operaciones con el resultado si no hay excepción
            System.out.println("Resultado: " + result);
        } catch (ArithmeticException e) {
            // Manejo de la excepción de división por cero
            System.out.println("Error: División por cero");
        } finally {
            // Bloque finally para dejar el programa en un estado consistente
        }
    }

    // Función que lanza una excepción en caso de división por cero
    public static int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("División por cero"); // Excepción unchecked
        }
        return a / b;
    }
}