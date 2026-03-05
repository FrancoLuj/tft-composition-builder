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
    
    public Composition(String name){
        this.name=name;
        this.champions = new ArrayList<>(); //Creo lista vacia --
        this.cantTrait=0;
    }
    
//GETTERS Y SETTERS
    
    public List<Champion> getChampions(){
        return this.champions;
    }
    
    public String getName(){
        return this.name;
    }
    
    //METODOS
    
    //Agregar campeon
    public boolean addChampion(Champion c){
        for(Champion elem:champions){
            if(elem.getName().equalsIgnoreCase(c.getName())){
                System.out.println("El campeon " + c.getName() + " ya existe en la composicion");
                return false;
            }
        }
        
        champions.add(c);
        return true;
    }
    
    
    //Remover campeon
    public boolean removeChampion(String name){
        for (int i=0 ; i<champions.size() ; i++){
            //Uso get(i) para ver el campeon en esa pos, y pido su nombre para compararlo con el parametro
            if(champions.get(i).getName().equalsIgnoreCase(name)){
                champions.remove(i);
                return true;
            }
        }
        
       
        return false;
    }
    
    //Contar campeones de una compo
    public int countChampions(){
        return champions.size();
    }
    
    //Ver si contiene un campeon
    public boolean containsChampion(String name){
        for(Champion c : champions){
            if(c.getName().equalsIgnoreCase(name)){
                return true;
            }
        }
        return false;
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


