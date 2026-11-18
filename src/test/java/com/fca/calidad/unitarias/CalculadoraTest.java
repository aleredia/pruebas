package com.fca.calidad.unitarias;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.within;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    @Test
    public void testSuma() {
        // 1. Arrange (Preparación de datos)
        Calculadora calculadora = new Calculadora();
        double operador1 = 5.0;
        double operador2 = 3.0;
        double resultadoEsperado = 8.0;

        // 2. Act (Ejecución del método a probar)
        double resultadoObtenido = calculadora.suma(operador1, operador2);

        // 3. Assert (Verificación del resultado)
        assertThat(resultadoObtenido).isCloseTo(resultadoEsperado, within(0.001));
    }

    @Test
    public void testResta() {
        // 1. Arrange
        Calculadora calculadora = new Calculadora();
        double operador1 = 10.0;
        double operador2 = 4.0;
        double resultadoEsperado = 6.0;

        // 2. Act
        double resultadoObtenido = calculadora.resta(operador1, operador2);

        // 3. Assert
        assertThat(resultadoObtenido).isCloseTo(resultadoEsperado, within(0.001));
    }

    @Test
    public void testDivide() {
        // 1. Arrange
        Calculadora calculadora = new Calculadora();
        double operador1 = 9.0;
        double operador2 = 3.0;
        double resultadoEsperado = 3.0;

        // 2. Act
        double resultadoObtenido = calculadora.divide(operador1, operador2);

        // 3. Assert
        assertThat(resultadoObtenido).isCloseTo(resultadoEsperado, within(0.001));
    }

    @Test
    public void testMultiplica() {
        // 1. Arrange
        Calculadora calculadora = new Calculadora();
        double operador1 = 4.0;
        double operador2 = 5.0;
        double resultadoEsperado = 20.0;

        // 2. Act
        double resultadoObtenido = calculadora.multiplica(operador1, operador2);

        // 3. Assert
        assertThat(resultadoObtenido).isCloseTo(resultadoEsperado, within(0.001));
    }
}
