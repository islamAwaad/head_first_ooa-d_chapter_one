/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.guitars;

/**
 *
 * @author islam
 */
public enum Builder {
    FENDER,MARTIN,GIBSON, COLLINGS,
    OLSON, RYAN, PRS, ANY;

    public String toString() {
        switch(this) {
            case FENDER: return "Fender";
            case MARTIN: return "Martin";
            case GIBSON: return "Gibson";
            case OLSON: return "OLSON";
            case RYAN: return "Ryan";
            case PRS: return "Prs";
            default: return "Any";
        }
    }
}
