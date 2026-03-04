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
public class Composition {
    //ATRIBUTOS
    private String name;
    private List<Champion> champions;
     private int cantTrait;
    
    //CONSTRUCTOR
    public Composition(String name, List<Champion> champions){
        this.name=name;
        this.champions=champions;
        this.cantTrait=0;
    }
    //GETTERS Y SETTERS
    
    public List<Champion> getChampions(){
        return this.champions;
    }
    
    //METODOS
    
    //Agregar campeon
    public void addChampion(Champion c){
        champions.add(c);
        System.err.println(c.getName() + " fue agregado a la composición.");
    }
    
    //Remover campeon
    public void removeChampion(Champion c){
        champions.remove(c);
        System.out.println(c.getName() + " fue eliminado de la composición."); 
    }
    
    //Contar campeones de una compo
    public int countChampions(){
        return champions.size();
    }
    
    //Ver si contiene un campeon
    public boolean containsChampion(Champion c){
        return champions.contains(c);
    }
    
    //Ver todos los campeones
    public void seeAllChamp(){
        System.out.println("Campeones de la composición: ");
        for(Champion c:champions) System.out.println(c.getName() + ",");
    }
    
    //Ver cantidad de sinergias de una compo
    public Map<Trait,Integer> compTraits(){
        Map<Trait,Integer> traitsCount = new HashMap<>();
        for(Champion c:this.champions){
            for(Trait trait:c.getTraits()){
                traitsCount.put(trait, traitsCount.getOrDefault(trait, 0) + 1);
            }
        }
        return traitsCount;
    }
}


