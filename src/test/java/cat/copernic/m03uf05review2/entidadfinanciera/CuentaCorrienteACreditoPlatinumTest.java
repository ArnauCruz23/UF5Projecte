package cat.copernic.m03uf05review2.entidadfinanciera;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class CuentaCorrienteACreditoPlatinumTest {
    
    private CuentaCorrienteImp instance;
    
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
        instance = new CuentaCorrienteACreditoPlatinum(1000, "Ramón");
    }
    
    //Aquest metode s'executa al principi
    @After
    public void tearDown() {
        instance = null;
    }
    
    
    @Test
    public void testAbona() {
        instance.abona(6000);
        assertEquals(-5000, instance.getSaldo(),2);        
       
    }
    
    
    @Test(expected = AssertionError.class)
    public void testAbonaErrorMes() {
        instance.abona(10000);
        assertEquals(-9000, instance.getSaldo(),2);
      
    }
    
    @Test(expected = AssertionError.class)
    public void testAbonaErrorNegatiu() {
        instance.abona(-1000);
        assertEquals(-1000, instance.getSaldo(),2);
      
    }
    
    @Test(expected = AssertionError.class)
    public void testAbonaErrorCero() {
        instance.abona(0);
        assertEquals(0, instance.getSaldo(),2);
      
    }
    
    @Test
    public void testIngresa() {
        instance.ingresa(1000);
        assertEquals(2000, instance.getSaldo(),2);        
       
    }
    
    
    @Test(expected = AssertionError.class)
    public void testIngresarErrorNegativo() {
        instance.ingresa(-10000);
        assertEquals(-9000, instance.getSaldo(),2);
      
    }
    
    @Test(expected = AssertionError.class)
    public void testIngresarErrorCero() {
        instance.ingresa(0);
        assertEquals(0, instance.getSaldo(),2);
      
    }
    
}
