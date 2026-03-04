/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tft.compos.model;

import java.util.NavigableSet;

/**
 *
 * @author Franco
 */
public class Trait {
    //ATRIBUTOS
    private final String name;
    private final String description;
    
    //CONSTRUCTOR
    public Trait (String name, String description){
        this.name=name;
        this.description=description;
    }
    
    //GETTERS Y SETTERS
    
    public String getName(){
        return this.name;
    }
    
    public String getDescription(){
        return this.description;
    }
}
