/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.tft.compos;
import com.tft.compos.data.*;
import com.tft.compos.model.*;
import com.tft.compos.service.CompositionService; 
import java.util.*;

/**
 *
 * @author Franco
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Composiciones TFT - Version Consola");
        
        //TENGO QUE CREAR EL MENU
        
        List<Trait> listaDeSinergias = TraitData.getAllTraits();
        System.out.println("Lista de sinergias del juego: ");
        for (Trait elem:listaDeSinergias){
            System.out.println(elem.getName());
        }
        
        System.out.println("Cantidad de sinergias totales: "+TraitData.countTraits());
        
        
        
        
        
    }
}
