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
     * Test of isValidRoman method, of class FieldVerifier.
     */
    @Test
    public void testIsValidRomanOK() {
        String nbr = "V";
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
