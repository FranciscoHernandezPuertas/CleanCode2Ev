/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import es.dam.dam1hernandezpuertas_francisco_actividadcleancodeii.Estanteria;
import es.dam.dam1hernandezpuertas_francisco_actividadcleancodeii.Libro;
import es.dam.dam1hernandezpuertas_francisco_actividadcleancodeii.Seccion;
import es.dam.dam1hernandezpuertas_francisco_actividadcleancodeii.Usuario;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class BibliotecaTest {

    private Libro libro1;
    private Libro libro2;
    private Estanteria estanteria1;
    private Seccion seccionInformatica;
    private Usuario usuario1;

    @BeforeAll
    static void setUpAll() {
        System.out.println("Configuración inicial para todas las pruebas");
    }

    @BeforeEach
    void setUp() {
        // Inicialización antes de cada prueba
        // Crear instancias de Libro, Estanteria, Seccion y Usuario
        libro1 = new Libro("Clean Code", "Robert C. Martin", "9780132350884", true);
        libro2 = new Libro("The Pragmatic Programmer", "Andrew Hunt, David Thomas", "9780201616224", true);

        // Crear una lista de libros y añadir los libros a la lista
        List<Libro> librosEnEstanteria = new ArrayList<>();
        librosEnEstanteria.add(libro1);
        librosEnEstanteria.add(libro2);

        // Crear una estantería y pasarle la lista de libros
        estanteria1 = new Estanteria(1, librosEnEstanteria);

        // Crear una lista de estanterías y añadir la estantería1 a la lista
        List<Estanteria> estanteriasEnSeccion = new ArrayList<>();
        estanteriasEnSeccion.add(estanteria1);

        // Crear una sección y pasarle la lista de estanterías
        seccionInformatica = new Seccion("Informática", estanteriasEnSeccion);

        List<Libro> librosPrestados = new ArrayList<>();
        usuario1 = new Usuario("Usuario1", 1, librosPrestados);
    }

    @Test
    @DisplayName("Prueba para el método tomarLibroPrestado")
    @Tag("PruebaBiblioteca")
    void testTomarLibroPrestado() {
        assertDoesNotThrow(() -> {
            usuario1.tomarLibroPrestado(libro1);
            assertFalse(libro1.isDisponible());
            assertTrue(usuario1.getLibrosPrestados().contains(libro1));
        });
    }

    @Test
    @DisplayName("Prueba para el método devolverLibro")
    @Tag("PruebaBiblioteca")
    void testDevolverLibro() {
        // Caso 1: Devolver un libro prestado
        assertDoesNotThrow(() -> {
            usuario1.tomarLibroPrestado(libro1);
            usuario1.devolverLibro(libro1);
            assertTrue(libro1.isDisponible());
            assertFalse(usuario1.getLibrosPrestados().contains(libro1));
        });

        // Caso 2: Intentar devolver un libro no prestado
        assertThrows(RuntimeException.class, () -> {
            usuario1.devolverLibro(libro2); // Debe lanzar una excepción porque el libro2 no está prestado
        });
    }


    @Test
    @DisplayName("Prueba para el método buscarLibroPorTitulo")
    @Tag("PruebaBiblioteca")
    void testBuscarLibroPorTitulo() {
        assertEquals(libro1, estanteria1.buscarLibroPorTitulo("Clean Code"));
        assertEquals(new Libro(), estanteria1.buscarLibroPorTitulo("")); //El texto de un libro no existente, según el constructor por defecto, es una cadena vacía
    }

    @Test
    @DisplayName("Prueba para el método agregarEstanteria")
    @Tag("PruebaBiblioteca")
    void testAgregarEstanteria() {
        // Agregar una estantería a la sección
        seccionInformatica.agregarEstanteria(estanteria1);

        // Verificar que la estantería fue agregada correctamente
        assertTrue(seccionInformatica.getEstanterias().contains(estanteria1));
    }
    

    @Test
    @DisplayName("Prueba para el método quitarEstanteria")
    @Tag("PruebaBiblioteca")
    void testQuitarEstanteria() {
        // Quitar la estantería de la sección
        seccionInformatica.quitarEstanteria(estanteria1);

        // Verificar que la estantería fue quitada correctamente
        assertFalse(seccionInformatica.getEstanterias().contains(estanteria1));
    }

    @AfterEach
    void tearDown() {
        System.out.println("Tareas de limpieza después de cada prueba");
    }

    @AfterAll
    static void tearDownAll() {
        System.out.println("Tareas de limpieza después de todas las pruebas");
    }
}
