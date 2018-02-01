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
public class Lightswitch {
    
    private Mode mode;
    
    public Lightswitch (){
        mode=Mode.OFF;
    }
    public Mode getMode(){
        return mode;
    }
    public void setMode(Mode inputmode){
        mode= inputmode;
    }
     public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
