/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tft.compos.model;

import java.util.*;

/**
 *
 * @author Franco
 */
public class Champion {
    //ATRIBUTOS
    private final String name;
    private List<Trait> traits;
    private final int cost;
    
    //CONSTRUCTOR
    
    public Champion(String name,List<Trait> traits ,int cost){
        this.name=name;
        this.cost=cost;
        this.traits=traits;
    }
    
    //GETTER Y SETTER
        
    public String getName(){
        return this.name;
    }
    
    public int getCost(){
        return this.cost;
    }
    
    public List<Trait> getTraits(){
        return this.traits;
    }
    
    
}

