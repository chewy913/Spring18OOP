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
public class LightRegulatorTest {
    
    public LightRegulatorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getCurrentlevel method, of class LightRegulator.
     */
    @Test
    public void testGetCurrentlevel() {
        System.out.println("getCurrentlevel");
        LightRegulator instance = new LightRegulator();
        instance.setLightLevel(27);
        int expResult = 27;
        int result = instance.getCurrentlevel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setLightLevel method, of class LightRegulator.
     */
    @Test
    public void testSetLightLevel() {
        System.out.println("setLightLevel");
        int newlevel = 37;
        LightRegulator instance = new LightRegulator();
        instance.setLightLevel(newlevel);
        assertEquals(newlevel,instance.getCurrentlevel());
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
