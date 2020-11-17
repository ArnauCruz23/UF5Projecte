/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.m03uf05review2.regexpr.calc;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author pep
 */
public class CalculadoraDeFraccionesTest {
    
    private CalculadoraDeFracciones instance;
    
    public CalculadoraDeFraccionesTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Iniciando tests ...");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("Finalizando tests ...");
    }
    
    @Before
    public void setUp() {
        Fraccion f1 = new Fraccion(2, 3);
        Fraccion f2 = new Fraccion(2, 3);
        instance = new CalculadoraDeFracciones(f1, f2);
    }
    
    @After
    public void tearDown() {
        instance = null;
    }

    /**
     * Test of suma method, of class CalculadoraDeFracciones.
     */
    @Test
    public void testSuma() {
        assertEquals(new Fraccion(12.0, 9.0), instance.suma());
        assertEquals(12.0, instance.suma().getNumerador(), 0.001);
        assertEquals(9.0, instance.suma().getDenominador(), 1.0E-3); // 1.0 ^ -3 -> 1 / 1000
    }
    
    @Test
    public void testResta() {
        assertEquals(new Fraccion(12.0, 9.0), instance.resta());
    }
    
    @Test
    public void testMultiplicar() {
        
    }
    
    @Test
    public void testDivisio() {
        
    }
    
    

    /**
     * Test of resta method, of class CalculadoraDeFracciones.
     */
    
    
}
