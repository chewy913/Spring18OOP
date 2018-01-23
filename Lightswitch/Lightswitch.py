class LightSwitch:
    SWITCH_ON=1
    SWITCH_OFF=0
    def __init__(self):
        self._mode= LightSwitch.SWITCH_OFF
    def getMode(self):
        return self._mode
    
    def validMode(self,mode):
        if mode!=LightSwitch.SWITCH_OFF and mode!=LightSwitch.SWITCH_ON:
            raise Exception('Value must be either 0 or 1')
        
    def setMode(self, mode):
        self.validMode(mode)
        self._mode=mode
        

