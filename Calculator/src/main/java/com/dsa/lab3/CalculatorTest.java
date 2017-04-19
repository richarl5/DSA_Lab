package com.dsa.lab3;

import junit.framework.TestCase;
/**
 * Created by Home on 01/03/2017.
 */
public class CalculatorTest extends TestCase {
    private Calculator cal;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        cal = new Calculator();
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
        // Fin de test. Aqui liberar recursos o borrar rastros del test
    }

    public void testGetSuma() {
        assertEquals("Test suma", 2.0, Calculator.getSuma(1.0, 1.0), 1e-6);
    }

    public void testIncrementa() {
        assertEquals("Test incrementa", 2.0, Calculator.incrementa(1.0), 1e-6);
    }

    public void testDecrementa() {
        assertEquals("Test decrementa", 1.0, Calculator.decrementa(2.0), 1e-6);
    }

    public void testGetDiferencia() {
        assertEquals("Test resta", 1.0, Calculator.getDiferencia(2.0, 1.0), 1e-6);
    }
}

