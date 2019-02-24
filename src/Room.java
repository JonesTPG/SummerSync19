
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author joonas
 */
abstract class Room {
    
    protected String name;
    protected String location;
    protected int size;
    protected Equipment equipment;
    

    public String showInformation() {
        return "Information";
    }

   
    
    
}
