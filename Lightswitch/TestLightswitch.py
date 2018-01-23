import unittest
from lightswitch import LightSwitch
class testLightSwitch(unittest.TestCase):
    def testInit(self):
        unit= LightSwitch()
        self.assertEqual(unit.getMode(), LightSwitch.SWITCH_OFF)
    def testMode(self):
        unit=LightSwitch()
        unit.setMode(LightSwitch.SWITCH_ON)
        self.assertEqual(unit.getMode(), LightSwitch.SWITCH_ON)        
        unit.setMode(LightSwitch.SWITCH_OFF)
        self.assertEqual(unit.getMode(), LightSwitch.SWITCH_OFF)
    def testvalidMode(self):
        unit=LightSwitch()
        with self.assertRaises(Exception) as context:
            unit.setMode(3)

        self.assertTrue("Value must be either 0 or 1" in str(context.exception))    

        
        

if __name__== '__main__':
    unittest.main()
    
    
        
        
