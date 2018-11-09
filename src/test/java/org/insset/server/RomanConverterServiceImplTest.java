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
        String nbr = "XX";
        RomanConverterServiceImpl instance = new RomanConverterServiceImpl();
        Integer expResult = 20;
        Integer result = instance.convertRomanToArabe(nbr);
        assertEquals(expResult, result);
    }

    /**
     * Test of convertArabeToRoman method, of class RomanConverterServiceImpl.
     */
    @Test
    public void testConvertArabeToRoman() {
        Integer nbr = 6;
        RomanConverterServiceImpl instance = new RomanConverterServiceImpl();
        String expResult = "VI";
        String result = instance.convertArabeToRoman(nbr);
        assertEquals(expResult, result);
    }
    
}
