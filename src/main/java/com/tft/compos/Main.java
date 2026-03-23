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
        List<Composition> compos = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        
        while (true) {            
            
            System.out.println("*************************************");
            System.out.println("Composiciones TFT - Version Consola");
            System.out.println("*************************************\n");
        
            System.out.println("1. Ver todos los campeones disponibles del juego");
            System.out.println("2. Crear una composicion");
            System.out.println("3. Agregar campeon a una composicion");
            System.out.println("4. Eliminar campeon de una composicion");
            System.out.println("5. Ver si un campeon se encuentra en la composicion");
            System.out.println("6. Ver sinergias de la composicion");
            System.out.println("7. Buscar campeon/es (Por rasgo o costo)");
            System.out.println("8. Recomendador de sinergias"); //PROXIMAMENTE
            System.out.println("9. Guardar/cargar composiciones"); //PROXIMAMENTE
            System.out.println("0. Salir\n");

            System.out.print("Elija una opcion para continuar: ");
            int opc = Integer.parseInt(sc.nextLine());
        
        
            switch (opc) {
                case 1:
                    List<Champion> champList = ChampionData.getAllChampions();
                    for(Champion elem:champList){
                        System.out.println(elem.getName() + " || Costo: " + elem.getCost());
                    }
                    System.out.print("Presione ENTER para volver al menu principal..");
                    sc.nextLine();
                    break;
                
                case 2:
                    System.out.print("Ingrese el nombre que le quiere poner a su composicion: ");
                    String compoName = sc.nextLine();
                    
                    while (true) {                        
                        if(compoName.isEmpty()) {
                            System.out.print("El nombre no puede estar vacio. Ingrese un nuevo nombre: ");
                            compoName = sc.nextLine();
                        }
                        
                        else if(searchCompo(compos, compoName) != null){
                            System.out.print("Ya existe una composicion con ese nombre! Ingrese otro nombre: ");
                            compoName = sc.nextLine();
                        }
                        else break;
                    }
                    
                    
                    //Creo composicion y la agrego a mi arrayList de compos
                    Composition c = new Composition(compoName);
                    compos.add(c);
                    
                    //Quiero agregar ahora campeones? (tengo la opcion mas adelante tambien)
                    System.out.print("Desea agregar campeon/es a la composicion " + c.getName() + "? si/no: ");
                    String op = sc.nextLine();
                    while(op.equalsIgnoreCase("si")){
                        //Pido nombre del champ a agregar y verifico si existe
                        System.out.print("Ingrese el nombre del campeon que desea agregar: ");
                        String chName = sc.nextLine();
                        Champion chFound2 = ChampionData.findByName(chName);
                        
                        //Si no existe aviso
                        if(chFound2 == null) System.out.println("El campeon ingresado no existe!! Intente nuevamente");
                      
                        //Si existe el nombre y el campeon aun no esta, lo agrego a la composicion
                        else {
                            boolean exito2 = c.addChampion(chFound2);
                            if(exito2 == true){
                                System.out.println(chFound2.getName() + " fue agregado a la composicion " + c.getName()) ; 
                            }
                        }
                        //Vuelvo a preguntar para seguir o no en el bucle
                        System.out.print("Desea agregar otro campeon? si/no: ");
                        op = sc.nextLine();
                    }    
                    
                    break;
                    
                
                case 3:
                    //SI la lista de composiciones esta vacia:
                    if(compos.isEmpty()) {
                        System.out.println("Todavia no se creo ninguna composicion, presione ENTER para volver al menu principal..");
                        sc.nextLine();                        
                        break;
                    }
                    
                    //Sino, muestro las disponibles
                    System.out.print("Composiciones disponibles: ");
                    for(Composition elem:compos) System.out.print(elem.getName() + " | ");
                    System.out.println();
                    
                    
                    Composition chosenCom3 = null;
                    while(chosenCom3 ==null ){
                                               
                        System.out.print("Ingrese nombre de la composicion a la que desea agregar campeon/es: ");
                        String compoNameAdd = sc.nextLine();
                    
                        chosenCom3 = searchCompo(compos, compoNameAdd);
                        
                        if(chosenCom3 == null) System.out.println("La composicion ingresada no existe.");
                    }
                    
                    //Muestro los campeones de la comp elegida
                    chosenCom3.seeAllChamp();
                    
                    String op3 = "si";
                    while(op3.equalsIgnoreCase("si")){
                        System.out.print("Ingrese nombre de campeon que desea agregar: ");
                            String champAdd = sc.nextLine();
                            Champion chFound3 = ChampionData.findByName(champAdd);
                            
                            if(chFound3 == null) System.out.println("El campeon ingresado no existe");
                                
                            else{
                                boolean existe3 = chosenCom3.addChampion(chFound3);
                                if(existe3 == true){
                                    System.out.println(chFound3.getName() + " fue agregado a la composicion " + chosenCom3.getName());
                                }
                            }
                                
                        System.out.print("Desea ingresar otro campeon? si/no: ");
                        op3 = sc.nextLine();
                    }
                    
                    break;
                        
                    
                    
                    
                            
                    
                case 4:    
                    //SI la lista de composiciones esta vacia:
                    if(compos.isEmpty()) {
                        System.out.println("Todavia no se creo ninguna composicion. Presione ENTER para volver al menu principal");
                        sc.nextLine();
                        break;
                    }
                    

                    //Sino, muestro composiciones disponibles
                    System.out.println("Composiciones disponibles: ");
                    for(Composition elem:compos) System.out.print(elem.getName() + " | ");
                    System.out.println();
                    
                    Composition chosenCom4 = null;
                    while(chosenCom4 == null){
                        
                        
                        //Pido que se ingrese el nombre de la compo elegida
                        System.out.print("Ingrese el nombre de la composicion de la que desea eliminar un campeon: ");
                        String compoNameRemove = sc.nextLine();
                        
                        //Chequeo si el nombre de la composicion existe
                        chosenCom4 = searchCompo(compos, compoNameRemove);
                        
                        if (chosenCom4 == null) System.out.println("La composicion " + compoNameRemove + " no existe");
                        
                    }
                    
                    //Muestro los campeones de la comp elegida
                    chosenCom4.seeAllChamp();
                    
                    //Bucle para eliminar campeones
                    String op4 = "si";
                    while(op4.equalsIgnoreCase("si")){
                        //Pido el nombre del campeon a eliminar
                        System.out.print("Ingrese el nombre del campeon que desea eliminar: ");
                        String chRemove = sc.nextLine();
                                
                        //creo una variable boolean y le asigno la composicion con el metodo remover y de parametro
                        //lo que escribio el usuario, si me devuelve true es porque hubo coincidencia
                        //si es false es porque no existia el campeon en la composicion
                        boolean deleted = chosenCom4.removeChampion(chRemove);
                                
                        if(deleted == true) System.out.println(chRemove +" fue eliminado de la composicion");
                        else System.out.println(chRemove + " no se encontraba en la composicion!");
                                
                                
                        //Consulto si quiero eliminar otro campeon
                        System.out.print("Desea eliminar otro campeon? si/no: ");
                        op4 = sc.nextLine();
                        
                    }
                                    
                    break;
                    
                case 5:
                    if(compos.isEmpty()){
                        System.out.println("Todavia no se creo ninguna composicion. Presione ENTER para volver al menu principal..");
                        sc.nextLine();
                        break;
                    }
                    
                    //Muestro compos disponibles
                    System.out.println("Composiciones disponibles: ");
                    for (Composition elem : compos) System.out.print(elem.getName()+ " | ");
                    System.out.println();
                    
                    Composition chosenCom5 = null;
                    while (chosenCom5 == null) {
                        System.out.print("Elija una composicion para buscar un campeon: ");
                        String compoSearch = sc.nextLine();
                    
                        chosenCom5 = searchCompo(compos, compoSearch);
                    
                        if(chosenCom5 == null) System.out.println("La composicion ingresada no existe");
                        
                    }
                    
                    String op5 = "si";
                    while(op5.equalsIgnoreCase("si")){
                        System.out.print("Ingrese el nombre del campeon que quiere buscar: ");
                        String chSearch = sc.nextLine();
                            
                        if(chosenCom5.containsChampion(chSearch) == true) System.out.println(chSearch + " esta en la composicion!");
                        else System.out.println(chSearch + " NO esta en la composicion");
                            
                        System.out.print("Desea buscar otro campeon? si/no: ");
                        op5 = sc.nextLine();
                    }
                        
                    
                    break;
                    
                
                case 6:
                    if(compos.isEmpty()){
                        System.out.println("Todavia no se creo ninguna composición. Presione ENTER para volver al menu principal");
                        sc.nextLine();
                        break;
                    }
                    
                    //Muestro composiciones disponibles
                    System.out.println("Composiciones disponibles: ");
                    for(Composition elem: compos) System.out.print(elem.getName() + " | ");
                    System.out.println();
                    
                    Composition chosenCom6 = null;
                    while(chosenCom6 == null ){
                        System.out.print("Ingrese el nombre de la composicion para ver sus sinergias: ");
                        String compoTraits = sc.nextLine();
                    
                        chosenCom6 = searchCompo(compos, compoTraits);
                        if(chosenCom6 == null) System.out.println("La composicion ingresada no existe!");
                    }
                    
                    System.out.println(chosenCom6.compTraits()); 
                    
                    
                    
                    
                    System.out.print("Presione ENTER para volver al menu principal");
                    sc.nextLine();
                    break;
                    
                case 0:
                    System.out.println("Gracias por utilizar el simulador. Hasta la proxima!..");
                    System.exit(0); //cierra el programa 
                    break;
                    
                default:
                    System.out.println("Opcion invalida. Ingrese un numero del 1 al 6");
            
            }
        }
    }
    
    
    //Metodo para buscar composicion. Paso lista de compos y nombre de la compo que busco
        public static Composition searchCompo(List<Composition> comp, String nom){
            for(Composition elem : comp){
               if(elem.getName().equalsIgnoreCase(nom)) {
                   return elem;
               }
            }
            return null;
        }
}
