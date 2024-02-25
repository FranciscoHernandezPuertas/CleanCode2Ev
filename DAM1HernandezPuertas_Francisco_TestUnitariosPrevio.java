import es.dam.ejpruebasunitarias.Temperatura;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Tag;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

// Clase sin nombre duplicado
public class TemperaturaTestIncorrecto {

    @BeforeAll
    void setup() {
        // Configuración común para todos los tests
    }

    @Test
    void testCelsiusAFahrenheit() {
        Temperatura temperaturaObj = new Temperatura();
        double resultado = temperaturaObj.celsiusAFahrenheit(25.0);
        assertEquals(77.0, resultado, 0.01);
    }

    @Test
    void testCelsiusAReamur() {
        Temperatura temperaturaObj = new Temperatura();
        double resultado = temperaturaObj.celsiusAReamur(25.0);
        assertEquals(20.0, resultado, 0.01);
    }

    @Test
    void ejemploAsuncionCondicional() {
        double temperaturaAmbiente = obtenerTemperaturaAmbiente();
        Assumptions.assumeTrue(temperaturaAmbiente > 0, "La prueba requiere temperatura ambiente superior a cero grados Celsius");
    }

    @Test
    void asercionTimeout() {
        assertTimeout(Duration.ofSeconds(2), () -> {
            Thread.sleep(5000);
        });
    }

    @AfterEach
    void tearDown() {
        // Limpieza después de cada test
    }

    private double obtenerTemperaturaAmbiente() {
        return 10.0;
    }
}