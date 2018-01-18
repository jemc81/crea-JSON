/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qualitas.service;

import com.qualitas.modelo.entities.Motherboard;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ccapacitacion10
 */
public class MotherboardServiceTest {
    
    public MotherboardServiceTest() {
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
     * Test of main method, of class MotherboardService.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        MotherboardService.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of CreaMother method, of class MotherboardService.
     */
    @Test
    public void testCreaMother() {
        System.out.println("CreaMother");
        MotherboardService instance = new MotherboardService();
        Motherboard expResult = null;
        Motherboard result = instance.CreaMother();
        assertNotNull(result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}
