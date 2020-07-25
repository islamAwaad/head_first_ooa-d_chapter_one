/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.guitars;
import java.util.List;
import java.util.LinkedList;
import java.util.Iterator;

/**
 *
 * @author islam
 */
public class Inventory {
    private List guitars;
    
    public Inventory() {
        this.guitars = new LinkedList();
    }
    
    public void addGuitar(String serialNumber, double price,
                          Builder builder, String model,
                          Type type, Wood backwood, Wood topWood) {
        Guitar guitar = new Guitar(serialNumber, price, builder,
                                    model, type, backwood, topWood);
        this.guitars.add(guitar);
    }
    
    public Guitar getGuitar(String serialNumber) {
        for(Iterator i = guitars.iterator(); i.hasNext();) {
            Guitar guitar = (Guitar)i.next();
            
            if(guitar.getSerialNumber().equals(serialNumber)) {
                return guitar;
            }
        }
        return null;
    }
    
    public List search(Guitar searchGuitar) {
        List matchingGuitars = new LinkedList();
        
        for(Iterator i = guitars.iterator(); i.hasNext();) {
            Guitar guitar = (Guitar)i.next();
            if(guitar.getBuilder() !=  searchGuitar.getBuilder())
                continue;
            String model = searchGuitar.getModel().toLowerCase();
            if((model != null) && (!model.equals("")) && (!model.equals(guitar.getModel().toLowerCase())))
                continue;
            
            if(guitar.getType() != searchGuitar.getType())
                continue;

            if(guitar.getBackwood() != searchGuitar.getBackwood())
                continue;
            
            if(guitar.getTopWood() != searchGuitar.getTopWood())
                continue;
            matchingGuitars.add(guitar);
            
        }   
        return matchingGuitars;
    }
}
