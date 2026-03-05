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
        
            System.out.println("1. Ver todos los campeones disponibles");
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
                    System.out.print("Presione ENTER para volver al menu principal");
                    sc.nextLine();
                    break;
                
                case 2:
                    System.out.print("Ingrese el nombre que le quiere poner a su composicion: ");
                    String compoName = sc.nextLine();
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
                    System.out.println("Composiciones disponibles: ");
                    for(Composition elem:compos) System.out.println(elem.getName() + ", ");
                    
                    System.out.print("Ingrese nombre de la composicion a la que desea agregar campeon/es: ");
                    String compoNameAdd = sc.nextLine();
                    
                    for(Composition elem: compos){
                        if(elem.getName().equalsIgnoreCase(compoNameAdd)){
                            String op3 = "si";
                            while(op3.equalsIgnoreCase("si")){
                                System.out.print("Ingrese nombre de campeon que desea agregar: ");
                                String champAdd = sc.nextLine();
                                Champion chFound3 = ChampionData.findByName(champAdd);
                            
                                if(chFound3 == null) System.out.println("El campeon ingresado no existe");
                                
                                else{
                                    boolean existe3 = elem.addChampion(chFound3);
                                    if(existe3 == true){
                                      System.out.println(chFound3.getName() + "fue agregado a la composicion " + elem.getName());
                                    }
                                    
                                    
                                }
                                
                                System.out.print("Desea ingresar otro campeon? si/no: ");
                                op3 = sc.nextLine();
                            }
                            
                        }
                    }
                    break;
                    
                case 4:    
                    //Muestro composiciones disponibles
                    System.out.println("Composiciones disponibles: ");
                    for(Composition elem:compos) System.out.println(elem.getName() + ", ");
                    
                    //Pido que se ingrese el nombre de la compo elegida
                    System.out.print("Ingrese el nombre de la composicion de la que desea eliminar un campeon: ");
                    String compoNameRemove = sc.nextLine();
                    
                    //Chequeo si el nombre de la composicion existe
                    for(Composition elem:compos){
                        if(elem.getName().equalsIgnoreCase(compoNameRemove)){
                            //Imprimo los nombres de los campeones de esa composicion
                            System.out.println("Campeones de la composicion " + elem.getName()+ ": ");
                            for(Champion ch : elem.getChampions()) System.out.println(ch.getName() + ", ");
                            
                            String op4 = "si";
                            while(op4.equalsIgnoreCase("si")){
                              //Pido el nombre del campeon a eliminar
                                System.out.print("Ingrese el nombre del campeon que desea eliminar: ");
                                String chRemove = sc.nextLine();
                                
                                //creo una variable boolean y le asigno la composicion con el metodo remover y de parametro
                                //lo que escribio el usuario, si me devuelve true es porque hubo coincidencia
                                //si es false es porque no existia el campeon en la composicion
                                boolean deleted = elem.removeChampion(chRemove);
                                
                                if(deleted == true) System.out.println(chRemove +" fue eliminado de la composicion");
                                else System.out.println(chRemove + " no se encontraba en la composicion!");
                                
                                
                                //Consulto si quiero eliminar otro campeon
                                System.out.print("Desea eliminar otro campeon? si/no: ");
                                op4 = sc.nextLine();
                            }
                            
                        }
                    }
                    break;
                    
                case 5:
                    System.out.println("Composiciones disponibles: ");
                    for (Composition elem : compos) System.out.print(elem.getName()+ ", ");
                    
                    System.out.println("Elija una composicion para buscar un campeon: ");
                    String compoSearch = sc.nextLine();
                    
                    for(Composition elem : compos){
                        if(elem.getName().equalsIgnoreCase(compoSearch)){
                            System.out.println("Ingrese el nombre del campeon que quiere buscar: ");
                            String chSearch = sc.nextLine();
                            if(elem.containsChampion(chSearch) == true) System.out.println(chSearch + " esta en la composicion!");
                            else System.out.println(chSearch + "NO esta en la composicion");
                        }
                    }
                    break;
                    
                
                
                
                
                
                case 6:
                    System.out.println("Composiciones disponibles: ");
                    for(Composition elem: compos) System.out.println(elem.getName() + ", ");
                    System.out.print("Ingrese el nombre de la composicion para ver sus sinergias: ");
                    String compoTraits = sc.nextLine();
                    for(Composition elem:compos){
                        if(elem.getName().equalsIgnoreCase(compoTraits)){
                            System.out.println(elem.compTraits());
                        }
                    }
                    System.out.print("Presione ENTER para volver al menu principal");
                    sc.nextLine();
                    break;
            
            }
        }
        
        
        /*List<Trait> listaDeSinergias = TraitData.getAllTraits();
        System.out.println("Lista de sinergias del juego: ");
        for (Trait elem:listaDeSinergias){
            System.out.println(elem.getName());
        }
        
        System.out.println("Cantidad de sinergias totales: "+TraitData.countTraits());*/
        
        
        
        
    }
}
