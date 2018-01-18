/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qualitas.modelo.entities;

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
public class MotherboardTest {
    
    public MotherboardTest() {
    }
       
    @Test
    public void testGetMemoria() {
        System.out.println("getMemoria");
        Motherboard instance = new Motherboard("","");
        int expResult = 0;
        int result = instance.getMemoria();
        assertNotEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}
