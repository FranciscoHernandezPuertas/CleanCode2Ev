public class DAM1HernandezPuertas_Francisco_ObjetosEstructurasViejo {
    public static void main(String[] args) {
        // Crear un objeto de tipo Persona con datos directamente expuestos
        Persona persona = new Persona("John", 30);
        
        // Imprimir los datos directamente desde el objeto
        System.out.println("Nombre: " + persona.nombre);
        System.out.println("Edad: " + persona.edad);
        
        // Operación directa en los datos expuestos
        if (persona.edad > 18) {
            System.out.println("La persona es mayor de edad");
        } else {
            System.out.println("La persona es menor de edad");
        }
    }
}

class Persona {
    public String nombre;
    public int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
}