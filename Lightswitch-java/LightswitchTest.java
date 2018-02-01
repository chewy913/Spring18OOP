/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lightswitch;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author chewy913
 */
public class LightswitchTest {
    
    public LightswitchTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getMode method, of class Lightswitch.
     */
    @Test
    public void testGetMode() {
        System.out.println("getMode");
        Lightswitch instance = new Lightswitch();
        Mode expResult = Mode.OFF;
        Mode result = instance.getMode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setMode method, of class Lightswitch.
     */
    @Test
    public void testSetMode() {
        System.out.println("setMode");
        Mode inputmode = Mode.ON;
        Lightswitch instance = new Lightswitch();
        instance.setMode(inputmode);
        Mode currentMode=instance.getMode();
        assertEquals(currentMode, inputmode);
        inputmode=Mode.OFF;
        instance.setMode(inputmode);
        currentMode=instance.getMode();
        assertEquals(currentMode, inputmode);
        
        
        
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
 
