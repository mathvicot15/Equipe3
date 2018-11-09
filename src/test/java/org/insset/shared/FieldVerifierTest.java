/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.insset.shared;

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
public class FieldVerifierTest {
    
    public FieldVerifierTest() {
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
     * Test of isValidName method, of class FieldVerifier.
     */
    @Test
    public void testIsValidNameOK() {
        String str = "bob";
        boolean expResult = true;
        boolean result = FieldVerifier.isValidName(str);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isValidName method, of class FieldVerifier.
     */
    @Test
    public void testIsValidNameNOK() {
        String str = "";
        boolean expResult = false;
        boolean result = FieldVerifier.isValidName(str);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isValidName method, of class FieldVerifier.
     */
    @Test
    public void testIsValidNameNOKNull() {
        String str = null;
        boolean expResult = false;
        boolean result = FieldVerifier.isValidName(str);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isValidDecimal method, of class FieldVerifier.
     */
    @Test
    public void testIsValidDecimal() {
        int nbr = 1;
        boolean expResult = true;
        boolean result = FieldVerifier.isValidDecimal(nbr);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isValidRoman method, of class FieldVerifier.
     */
    @Test
    public void testIsValidRomanOKI() {
        String nbr = "I";
        boolean expResult = true;
        boolean result = FieldVerifier.isValidRoman(nbr);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isValidRoman method, of class FieldVerifier.
     */
    @Test
    public void testIsValidRomanOKV() {
        String nbr = "V";
        boolean expResult = true;
        boolean result = FieldVerifier.isValidRoman(nbr);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isValidRoman method, of class FieldVerifier.
     */
    @Test
    public void testIsValidRomanOKX() {
        String nbr = "X";
        boolean expResult = true;
        boolean result = FieldVerifier.isValidRoman(nbr);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isValidRoman method, of class FieldVerifier.
     */
    @Test
    public void testIsValidRomanOKL() {
        String nbr = "L";
        boolean expResult = true;
        boolean result = FieldVerifier.isValidRoman(nbr);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isValidRoman method, of class FieldVerifier.
     */
    @Test
    public void testIsValidRomanOKC() {
        String nbr = "C";
        boolean expResult = true;
        boolean result = FieldVerifier.isValidRoman(nbr);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isValidRoman method, of class FieldVerifier.
     */
    @Test
    public void testIsValidRomanOKD() {
        String nbr = "D";
        boolean expResult = true;
        boolean result = FieldVerifier.isValidRoman(nbr);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isValidRoman method, of class FieldVerifier.
     */
    @Test
    public void testIsValidRomanOKM() {
        String nbr = "M";
        boolean expResult = true;
        boolean result = FieldVerifier.isValidRoman(nbr);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isValidRoman method, of class FieldVerifier.
     */
    @Test
    public void testIsValidRomanNOK() {
        String nbr = "a";
        boolean expResult = false;
        boolean result = FieldVerifier.isValidRoman(nbr);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isValidRoman method, of class FieldVerifier.
     */
    @Test
    public void testIsValidRomanNOKLimitSup() {
        String nbr = "MM";
        boolean expResult = false;
        boolean result = FieldVerifier.isValidRoman(nbr);
        assertEquals(expResult, result);
    }

    /**
     * Test of isValidDate method, of class FieldVerifier.
     */
    @Test
    public void testIsValidDateNOK() {
        String date = "a";
        boolean expResult = false;
        boolean result = FieldVerifier.isValidDate(date);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isValidDate method, of class FieldVerifier.
     */
    @Test
    public void testIsValidDateNOKDayInf() {
        String date = "00/12/1998";
        boolean expResult = false;
        boolean result = FieldVerifier.isValidDate(date);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isValidDate method, of class FieldVerifier.
     */
    @Test
    public void testIsValidDateNOKDaySup() {
        String date = "32/12/1998";
        boolean expResult = false;
        boolean result = FieldVerifier.isValidDate(date);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isValidDate method, of class FieldVerifier.
     */
    @Test
    public void testIsValidDateNOKMonthInf() {
        String date = "01/00/1998";
        boolean expResult = false;
        boolean result = FieldVerifier.isValidDate(date);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isValidDate method, of class FieldVerifier.
     */
    @Test
    public void testIsValidDateNOKMonthSup() {
        String date = "01/13/1998";
        boolean expResult = false;
        boolean result = FieldVerifier.isValidDate(date);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isValidDate method, of class FieldVerifier.
     */
    @Test
    public void testIsValidDateNOKYearInf() {
        String date = "01/12/0000";
        boolean expResult = false;
        boolean result = FieldVerifier.isValidDate(date);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isValidDate method, of class FieldVerifier.
     */
    @Test
    public void testIsValidDateNOKYearSup() {
        String date = "01/12/2001";
        boolean expResult = false;
        boolean result = FieldVerifier.isValidDate(date);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isValidDate method, of class FieldVerifier.
     */
    @Test
    public void testIsValidDateOK() {
        String date = "12/12/1980";
        boolean expResult = true;
        boolean result = FieldVerifier.isValidDate(date);
        assertEquals(expResult, result);
    }

    /**
     * Test of isBetween method, of class FieldVerifier.
     */
    @Test
    public void testIsBetweenOK() {
        int limit1 = 1;
        int limit2 = 2000;
        int value = 42;
        boolean expResult = true;
        boolean result = FieldVerifier.isBetween(limit1, limit2, value);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isBetween method, of class FieldVerifier.
     */
    @Test
    public void testIsBetweenNOKSup() {
        int limit1 = 1;
        int limit2 = 2000;
        int value = 2001;
        boolean expResult = false;
        boolean result = FieldVerifier.isBetween(limit1, limit2, value);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isBetween method, of class FieldVerifier.
     */
    @Test
    public void testIsBetweenNOKInf() {
        int limit1 = 1;
        int limit2 = 2000;
        int value = 0;
        boolean expResult = false;
        boolean result = FieldVerifier.isBetween(limit1, limit2, value);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isBetween method, of class FieldVerifier.
     */
    @Test
    public void testIsBetweenOKLimitInf() {
        int limit1 = 1;
        int limit2 = 2000;
        int value = 1;
        boolean expResult = true;
        boolean result = FieldVerifier.isBetween(limit1, limit2, value);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isBetween method, of class FieldVerifier.
     */
    @Test
    public void testIsBetweenOKLimitSup() {
        int limit1 = 1;
        int limit2 = 2000;
        int value = 2000;
        boolean expResult = true;
        boolean result = FieldVerifier.isBetween(limit1, limit2, value);
        assertEquals(expResult, result);
    }
    
}
