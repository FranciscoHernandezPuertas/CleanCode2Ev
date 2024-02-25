public class DAM1HernandezPuertas_Francisco_ObjetosEstructurasNuevo {
    public static void main(String[] args) {
        // Crear un objeto de tipo Persona utilizando abstracciones
        Persona persona = new Persona("John", 30);
        
        // Utilizar métodos para obtener y mostrar datos
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Edad: " + persona.getEdad());
        
        // Lógica basada en comportamientos del objeto, no en sus datos internos
        if (persona.esMayorDeEdad()) {
            System.out.println("La persona es mayor de edad");
        } else {
            System.out.println("La persona es menor de edad");
        }
    }
}

class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Métodos para acceder a los datos de manera controlada
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    // Método para lógica relacionada con la edad
    public boolean esMayorDeEdad() {
        return edad > 18;
    }
}