/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.m03uf05review2.generics.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author pep
 */
public class GenericsMain {
    
    
    
    /**
     * Escribe un método que retorne el ultimo elemento de una lista
     */
    public static <T> T ultimo(List<T> lista) {
        
        if(!lista.isEmpty()){
            return lista.get(lista.size()-1);
        }else{
            return null;
        }
            
        
    }
    
    
    /**
     * Escribe una método que retorne la media de una lista de Double
     */
    public static double media(List<Double> lista) {
        
        double n = 0;
            
        for (int i = 0; i < lista.size(); i++) {
            n = (n + lista.get(i)); 
        }
        return n / lista.size();
    }
    
    
    /**
     * Escribe un método que retorne la cadena mas larga de una lista de String
     */
    
    public static String largo(List<String> lista){
        
        if(lista.size() != 0){
            String resultat = lista.get(0);
            for(int x = 0; x < lista.size(); x++){
                if(lista.get(x).length() > resultat.length())
                resultat = lista.get(x);
            }
            return resultat;
            
        }else{return null;}
    }
    
    /**
     * Escribe un método que retorne el maximo de una lista de enteros
     */
    
    public static Integer maximo(List<Integer> lista){
    
        if(lista.size() != 0){
            
            int maximo = lista.get(0);
            
            for(int x = 0; x < lista.size(); x++){
                if(lista.get(x) > maximo){
                    maximo = lista.get(x);
                }
            }
            
            return maximo;
            
        }else{return null;}
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        List<String> lista1 = new ArrayList<>();
        
        lista1.add("Marta");
        lista1.add("Eva");   
        lista1.add("Joan");   
        lista1.add("Carles");   
        lista1.add("Pep");   
        
        ultimo(lista1);
        
        List<Double> lista2 = new ArrayList<>();
        lista2.add(5.5);
        lista2.add(4.4);   
        lista2.add(3.3);   
        lista2.add(2.2);   
        lista2.add(1.1);
        
        media(lista2);
        
        List<String> lista3 = new ArrayList<>();
        lista3.add("Se lo ha cortado");
        lista3.add("Ramón Rodriguez");   
        lista3.add("Porque");   
        lista3.add("No tiene rabo");   
        lista3.add("El perro de san roque");
        
        largo(lista3);
        
        List<Integer> lista4 = new ArrayList<>();
        lista4.add(5);
        lista4.add(4);   
        lista4.add(3);   
        lista4.add(2);   
        lista4.add(1);
        
        maximo(lista4);
        
        System.out.println("El ultimo es "+ultimo(lista1)+" la media es "+media(lista2)+" la més llarga es "+largo(lista3)+ " El maximo es " + maximo(lista4));
        
        
        /*if (lista1.isEmpty()) {
            System.out.println("Lista es buida");
        } else {
            System.out.println("Lista te " + lista1.size() + " elements.");
        }
        
        lista1.remove("Carles");
//        
//        for (int i = 0; i < lista1.size(); i++) {
//            System.out.println(lista1.get(i));
//        }
        
        for(Iterator<String> it = lista1.iterator(); it.hasNext();) {
            System.out.println(it.next());
        }
        
        List<String> l2 = lista1.subList(0, lista1.size()/ 2);*/
        
        
        
    }
    
}















