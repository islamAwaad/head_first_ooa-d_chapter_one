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
public enum Type {
        ACOUSTIC, ELECTRIC;

    public String toString() {
        switch(this) {
            case ACOUSTIC: return "Acoutic";
            case ELECTRIC: return "Electric";
            default: return "Acoutic";
        }
    }
}
