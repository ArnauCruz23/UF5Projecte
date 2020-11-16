package cat.copernic.m03uf05review2.entidadfinanciera;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class CuentaCorrienteDebitoTest {
    
    //Aquest metede s'executa abans de tots els tests
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Iniciant test");
    }
    
    //Aquest metode s'executa al final de tots els tests
    @AfterClass
    public static void tearDownClass() {
        System.out.println("Acabant tests");
    }
    
    //Aquest metode s'executa al final de tots els tests 
    @Before
    public void setUp() {
    }
    
    //Aquest metode s'executa al principi
    @After
    public void tearDown() {
    }
    
    @Test
    public void testAbona() {
        CuentaCorrienteImp d = new CuentaCorrienteDebito(1000, "Quintero");
        
        d.abona(500);
        assertEquals(500, d.getSaldo(),2);        
       
    }
    
    
    @Test(expected = AssertionError.class)
    public void testAbonaErrorMes() {
        CuentaCorrienteImp w = new CuentaCorrienteDebito(1000, "Quintero");
        
        w.abona(10000);
        assertEquals(0, w.getSaldo(),2);
      
    }
    
    @Test(expected = AssertionError.class)
    public void testAbonaErrorNegatiu() {
        CuentaCorrienteImp w = new CuentaCorrienteDebito(1000, "Quintero");
        
        w.abona(-1000);
        assertEquals(0, w.getSaldo(),2);
      
    }
    
    @Test(expected = AssertionError.class)
    public void testAbonaErrorCero() {
        CuentaCorrienteImp w = new CuentaCorrienteDebito(1000, "Quintero");
        
        w.abona(0);
        assertEquals(0, w.getSaldo(),2);
      
    }
    
    @Test
    public void testIngresa() {
        CuentaCorrienteImp e = new CuentaCorrienteDebito(1000, "Quintero");
        
        e.ingresa(1000);
        assertEquals(2000, e.getSaldo(),2);        
       
    }
    
    
    @Test(expected = AssertionError.class)
    public void testIngresarErrorNegativo() {
        CuentaCorrienteImp w = new CuentaCorrienteDebito(1000, "Quintero");
        
        w.ingresa(-10000);
        assertEquals(-9000, w.getSaldo(),2);
      
    }
    
    @Test(expected = AssertionError.class)
    public void testIngresarErrorCero() {
        CuentaCorrienteImp w = new CuentaCorrienteDebito(1000, "Quintero");
        
        w.ingresa(0);
        assertEquals(0, w.getSaldo(),2);
      
    }
    
}
