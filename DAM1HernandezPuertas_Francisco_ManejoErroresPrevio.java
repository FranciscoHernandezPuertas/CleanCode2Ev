public class DAM1HernandezPuertas_Francisco_ManejoErroresPrevio {
    public static void main(String[] args) {
        // Llamada a una función que devuelve un código de error
        int result = divide(10, 0);
        
        // Verificación del código de error y manejo del resultado
        if (result == -1) {
            System.out.println("Error: División por cero");
        } else {
            System.out.println("Resultado: " + result);
        }
    }

    // Función que devuelve un código de error en caso de división por cero
    public static int divide(int a, int b) {
        if (b == 0) {
            return -1; // Código de error
        }
        return a / b;
    }
}