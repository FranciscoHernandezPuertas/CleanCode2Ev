package TemperaturaTest;

import es.dam.ejpruebasunitarias.Temperatura;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Nested;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.assertTimeout;

@DisplayName("Temperatura Test")
public class TemperaturaTestCorrecto {

    private Temperatura temperaturaObj;

    @BeforeAll
    static void setup() {
        // Configuración común para todos los tests
    }

    @BeforeEach
    void beforeEach() {
        temperaturaObj = new Temperatura();
    }

    @Nested
    @DisplayName("Celsius a Fahrenheit")
    class CelsiusAFahrenheit {

        @Test
        @DisplayName("Convierte correctamente a Fahrenheit")
        void testCelsiusAFahrenheit() {
            double resultado = temperaturaObj.celsiusAFahrenheit(25.0);
            Assertions.assertEquals(77.0, resultado, 0.01);
        }

        @Test
        @DisplayName("Maneja correctamente temperaturas por debajo del cero absoluto")
        void testCelsiusAFahrenheitConError() {
            double resultado = temperaturaObj.celsiusAFahrenheit(-300.0);
            Assertions.assertEquals(999999, resultado, 0.01);
        }
    }

    @Nested
    @DisplayName("Celsius a Reamur")
    class CelsiusAReamur {

        @Test
        @DisplayName("Convierte correctamente a Reamur")
        void testCelsiusAReamur() {
            double resultado = temperaturaObj.celsiusAReamur(25.0);
            Assertions.assertEquals(20.0, resultado, 0.01);
        }

        @Test
        @DisplayName("Maneja correctamente temperaturas por debajo del cero absoluto")
        void testCelsiusAReamurConError() {
            double resultado = temperaturaObj.celsiusAReamur(-300.0);
            Assertions.assertEquals(999999, resultado, 0.01);
        }
    }

    @Test
    @DisplayName("Ejemplo de asunción condicional basada en temperatura ambiente")
    @Tag("condicional")
    void ejemploAsuncionCondicional() {
        double temperaturaAmbiente = obtenerTemperaturaAmbiente();
        Assertions.assertTrue(temperaturaAmbiente > 0, "La prueba requiere temperatura ambiente superior a cero grados Celsius");
    }

    @Test
    @DisplayName("AssertTimeout")
    void asercionTimeout() {
        assertTimeout(Duration.ofSeconds(2), () -> {
            Thread.sleep(1000);
        });
    }

    @AfterEach
    void afterEach() {
        // Limpieza después de cada test
    }

    private double obtenerTemperaturaAmbiente() {
        // Método ficticio para obtener la temperatura ambiente
        return 10.0; // Ejemplo de temperatura ambiente
    }
}
