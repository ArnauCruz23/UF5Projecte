/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.m03uf05review2.generics.collections.Ex.RegExp;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.params.provider.ValueSource;

/**
 *
 * @author arnib
 */
public class RegExprMainTest {
    
    public RegExprMainTest() {
    }
    
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

    /**
     * Test of validateNif method, of class RegExprMain.
     */
    @Test
    public void testValidateNif() {
        
        assertTrue(RegExprMain.validateNif("46388799G"));
        assertTrue(RegExprMain.validateNif("46343399F"));
        assertTrue(RegExprMain.validateNif("46664799G"));
        assertTrue(RegExprMain.validateNif("23455799H"));
        assertTrue(RegExprMain.validateNif("46383459Y"));
        
        assertFalse(RegExprMain.validateNif("46389A"));
        assertFalse(RegExprMain.validateNif("463899"));
        assertFalse(RegExprMain.validateNif("4638 799A"));
        assertFalse(RegExprMain.validateNif("46"));
        assertFalse(RegExprMain.validateNif("4638799"));
    }

    /**
     * Test of validateNie method, of class RegExprMain.
     */
    @Test
    public void testValidateNie() {
        
        assertTrue(RegExprMain.validateNie("X1234567F"));
        assertTrue(RegExprMain.validateNie("Y8547169H"));
        assertTrue(RegExprMain.validateNie("Z9632154F"));
        assertTrue(RegExprMain.validateNie("Y5698742T"));
        assertTrue(RegExprMain.validateNie("X8547521J"));
        
        
        assertFalse(RegExprMain.validateNie("A123 4567F"));
        assertFalse(RegExprMain.validateNie("1234567F"));
        assertFalse(RegExprMain.validateNie("A1-34567F"));
        assertFalse(RegExprMain.validateNie("j1234567f"));
        assertFalse(RegExprMain.validateNie("A12365222"));
    }

    /**
     * Test of validateTelefon method, of class RegExprMain.
     */
    @Test
    public void testValidateTelefon() {
        
        assertTrue(RegExprMain.validateTelefon("600354406"));
        assertTrue(RegExprMain.validateTelefon("908554406"));
        assertTrue(RegExprMain.validateTelefon("935847266"));
        assertTrue(RegExprMain.validateTelefon("600354490"));
        assertTrue(RegExprMain.validateTelefon("963522226"));
        
        assertFalse(RegExprMain.validateTelefon("400354406"));
        assertFalse(RegExprMain.validateTelefon("454406"));
        assertFalse(RegExprMain.validateTelefon("90000354406"));
        assertFalse(RegExprMain.validateTelefon("40035"));
        assertFalse(RegExprMain.validateTelefon("40035_4406"));
    }

    /**
     * Test of validateMatricula method, of class RegExprMain.
     */
    @Test
    public void testValidateMatricula() {
        assertTrue(RegExprMain.validateMatricula("9850 DCF"));
        assertTrue(RegExprMain.validateMatricula("5247 FGK"));
        assertTrue(RegExprMain.validateMatricula("9850 WRT"));
        assertTrue(RegExprMain.validateMatricula("5635 QSC"));
        assertTrue(RegExprMain.validateMatricula("5248 FGB"));
        
        assertFalse(RegExprMain.validateMatricula("854DVF"));
        assertFalse(RegExprMain.validateMatricula("503 DCA"));
        assertFalse(RegExprMain.validateMatricula("350_DCF"));
        assertFalse(RegExprMain.validateMatricula("50D"));
        assertFalse(RegExprMain.validateMatricula("350 acf"));
    }

    /**
     * Test of validateMail method, of class RegExprMain.
     */
    @Test
    public void testValidateTelefonEspanya() {
        
        assertTrue(RegExprMain.validateTelefonEspanya("+34600568872"));
        assertTrue(RegExprMain.validateTelefonEspanya("+34609633522"));
        assertTrue(RegExprMain.validateTelefonEspanya("+34685522555"));
        assertTrue(RegExprMain.validateTelefonEspanya("+34685222258"));
        assertTrue(RegExprMain.validateTelefonEspanya("+34696633335"));
        
        
        assertFalse(RegExprMain.validateTelefonEspanya("+35696633335"));
        assertFalse(RegExprMain.validateTelefonEspanya("55258"));
        assertFalse(RegExprMain.validateTelefonEspanya("633589975"));
        assertFalse(RegExprMain.validateTelefonEspanya("966333_88"));
        assertFalse(RegExprMain.validateTelefonEspanya("789/8852/88"));
    }
    
    @Test
    public void testValidateMail() {
        
        assertTrue(RegExprMain.validateMail("cruzcambra.arnau@gmail.com"));
        assertTrue(RegExprMain.validateMail("cruz52.arnau@gmail.com"));
        assertTrue(RegExprMain.validateMail("cruzcambra.arnau@gmail.salesians.com"));
        assertTrue(RegExprMain.validateMail("cruz.arnau.ramon.arnau@gmail.com"));
        assertTrue(RegExprMain.validateMail("cruzcambra.arnau20@gmail.com"));
        
        assertFalse(RegExprMain.validateMail("23arnau@gmail.com"));
        assertFalse(RegExprMain.validateMail("arnau@gmail@.com"));
        assertFalse(RegExprMain.validateMail("arnau_34gmail.com"));
        assertFalse(RegExprMain.validateMail("arnau..gmail.com"));
        assertFalse(RegExprMain.validateMail("amail.com"));
    }

    /**
     * Test of validateClaveE method, of class RegExprMain.
     */
    @Test
    public void testValidateClaveE() {
        
        assertTrue(RegExprMain.validateClaveE("AA223AA"));
        assertTrue(RegExprMain.validateClaveE("BB243BB"));
        assertTrue(RegExprMain.validateClaveE("SS223SS"));
        assertTrue(RegExprMain.validateClaveE("RR456RR"));
        assertTrue(RegExprMain.validateClaveE("WW999WW"));
        
        assertFalse(RegExprMain.validateClaveE("aa22BC"));
        assertFalse(RegExprMain.validateClaveE("bc22BC"));
        assertFalse(RegExprMain.validateClaveE("aa2332BC"));
        assertFalse(RegExprMain.validateClaveE("aa22aa"));
        assertFalse(RegExprMain.validateClaveE("aa22_bb"));
    }
    
    @Test
    public void testValidateData() {
        
        assertTrue(RegExprMain.validateData("07/12/2020"));
        assertTrue(RegExprMain.validateData("31/01/2026"));
        assertTrue(RegExprMain.validateData("23/11/2020"));
        assertTrue(RegExprMain.validateData("05/01/1997"));
        assertTrue(RegExprMain.validateData("07/12/2085"));
        
        assertFalse(RegExprMain.validateData("35/05/2020"));
        assertFalse(RegExprMain.validateData("21/18/2020"));
        assertFalse(RegExprMain.validateData("07/12//2020"));
        assertFalse(RegExprMain.validateData("07//05/2020"));
        assertFalse(RegExprMain.validateData("07-05-2020"));
    }

    /**
     * Test of main method, of class RegExprMain.
     */
    
    
}
