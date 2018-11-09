/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.insset.server;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author talend
 */
public class RomanConverterServiceImplTest {
    
    public RomanConverterServiceImplTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of convertDateYears method, of class RomanConverterServiceImpl.
     */
    @Test
    public void testConvertDateYearsOK() {
        String nbr = "01/01/2000";
        RomanConverterServiceImpl instance = new RomanConverterServiceImpl();
        String expResult = "I/I/MM";
        String result = instance.convertDateYears(nbr);
        assertEquals(expResult, result);
    }

    /**
     * Test of convertRomanToArabe method, of class RomanConverterServiceImpl.
     */
    @Test
    public void testConvertRomanToArabe() {
        String nbr = "IVXLCDM";
        RomanConverterServiceImpl instance = new RomanConverterServiceImpl();
        Integer expResult = 1666;
        Integer result = instance.convertRomanToArabe(nbr);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of convertArabeToRoman method, of class RomanConverterServiceImpl.
     */
    @Test
    public void testConvertArabeToRoman900() {
        Integer nbr = 900;
        RomanConverterServiceImpl instance = new RomanConverterServiceImpl();
        String expResult = "CM";
        String result = instance.convertArabeToRoman(nbr);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of convertArabeToRoman method, of class RomanConverterServiceImpl.
     */
    @Test
    public void testConvertArabeToRoman500() {
        Integer nbr = 500;
        RomanConverterServiceImpl instance = new RomanConverterServiceImpl();
        String expResult = "D";
        String result = instance.convertArabeToRoman(nbr);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of convertArabeToRoman method, of class RomanConverterServiceImpl.
     */
    @Test
    public void testConvertArabeToRoman400() {
        Integer nbr = 400;
        RomanConverterServiceImpl instance = new RomanConverterServiceImpl();
        String expResult = "CD";
        String result = instance.convertArabeToRoman(nbr);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of convertArabeToRoman method, of class RomanConverterServiceImpl.
     */
    @Test
    public void testConvertArabeToRoman100() {
        Integer nbr = 100;
        RomanConverterServiceImpl instance = new RomanConverterServiceImpl();
        String expResult = "C";
        String result = instance.convertArabeToRoman(nbr);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of convertArabeToRoman method, of class RomanConverterServiceImpl.
     */
    @Test
    public void testConvertArabeToRoman90() {
        Integer nbr = 90;
        RomanConverterServiceImpl instance = new RomanConverterServiceImpl();
        String expResult = "XC";
        String result = instance.convertArabeToRoman(nbr);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of convertArabeToRoman method, of class RomanConverterServiceImpl.
     */
    @Test
    public void testConvertArabeToRoman50() {
        Integer nbr = 50;
        RomanConverterServiceImpl instance = new RomanConverterServiceImpl();
        String expResult = "L";
        String result = instance.convertArabeToRoman(nbr);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of convertArabeToRoman method, of class RomanConverterServiceImpl.
     */
    @Test
    public void testConvertArabeToRoman40() {
        Integer nbr = 40;
        RomanConverterServiceImpl instance = new RomanConverterServiceImpl();
        String expResult = "XL";
        String result = instance.convertArabeToRoman(nbr);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of convertArabeToRoman method, of class RomanConverterServiceImpl.
     */
    @Test
    public void testConvertArabeToRoman10() {
        Integer nbr = 10;
        RomanConverterServiceImpl instance = new RomanConverterServiceImpl();
        String expResult = "X";
        String result = instance.convertArabeToRoman(nbr);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of convertArabeToRoman method, of class RomanConverterServiceImpl.
     */
    @Test
    public void testConvertArabeToRoman9() {
        Integer nbr = 9;
        RomanConverterServiceImpl instance = new RomanConverterServiceImpl();
        String expResult = "IX";
        String result = instance.convertArabeToRoman(nbr);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of convertArabeToRoman method, of class RomanConverterServiceImpl.
     */
    @Test
    public void testConvertArabeToRoman5() {
        Integer nbr = 5;
        RomanConverterServiceImpl instance = new RomanConverterServiceImpl();
        String expResult = "V";
        String result = instance.convertArabeToRoman(nbr);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of convertArabeToRoman method, of class RomanConverterServiceImpl.
     */
    @Test
    public void testConvertArabeToRoman4() {
        Integer nbr = 4;
        RomanConverterServiceImpl instance = new RomanConverterServiceImpl();
        String expResult = "IV";
        String result = instance.convertArabeToRoman(nbr);
        assertEquals(expResult, result);
    }
    
}
