/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.guitars;
import java.util.List;
import java.util.Iterator;
/**
 *
 * @author islam
 */
public class FindGuitarTester {
    public static void main(String [] args) {
        Inventory inventory = new Inventory();
        initializeInventory(inventory);
        
        Guitar whatILikes = new Guitar("",0,Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.BRAZILIAN_ROSEWOOD, Wood.INDIAN_ROSEWOOD);
        
        List guitars = inventory.search(whatILikes);
        
        System.out.println(guitars);
        if(!guitars.isEmpty()){
            for(Iterator i = guitars.iterator(); i.hasNext();) {
                Guitar guitar = (Guitar)i.next();
               System.out.println("You might like that guitar Model:" + guitar.getModel() +
                                  " - Price:" + guitar.getPrice() + 
                                  " - Builder:" + guitar.getBuilder() +
                                  " - Type:" + guitar.getType() + 
                                  " - BackWood:"+ guitar.getBackwood() + 
                                  " - TopWood:" + guitar.getTopWood());
            }
        }else {
            System.out.println("Sorry we don't have what u looking for");
        }
        
    }
    
    
    private static void initializeInventory(Inventory inventory) {
        inventory.addGuitar("guitar1", 1499.95, Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.BRAZILIAN_ROSEWOOD, Wood.INDIAN_ROSEWOOD);
        inventory.addGuitar("guitar2", 1550.95, Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.BRAZILIAN_ROSEWOOD, Wood.INDIAN_ROSEWOOD);
    }
}
