/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lightswitch;

/**
 *
 * @author chewy913
 */
public class LightRegulator extends Lightswitch {
    private int Lightlevel;
    
    public LightRegulator (){
        Lightlevel=0;
    }
    public int getCurrentlevel(){
        return Lightlevel;
    }
    public void setLightLevel(int newlevel){
        if(newlevel<0||newlevel>100){
            throw new IllegalArgumentException("Error Light Level must be between 0 and 100");
            
    } else{
            Lightlevel=newlevel;
            if (Lightlevel==0)
            {
                mode=Mode.OFF;
        }else{
                mode=Mode.ON;
            }
    }
}
}
