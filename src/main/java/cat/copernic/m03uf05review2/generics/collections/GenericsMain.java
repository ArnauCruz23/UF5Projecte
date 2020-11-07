/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.m03uf05review2.generics.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

class AlumnoEdadComparator implements Comparator<Alumno> {

    @Override
    //devuelve -1 si o1 < o2, 0 si o1 == o2; +i si o1 > o2
    public int compare(Alumno o1, Alumno o2) {
        if (o1.getEdad() < o2.getEdad()) {
            return -1;
        } else if (o1.getEdad() == o2.getEdad()) {
            return 0;
        } else {
            return 1;
        }
    }
}


/**
 *
 * @author pep
 */
public class GenericsMain {

    /**
     * Escribe un método que retorne el ultimo elemento de una lista
     */
    public static <T> T ultimo(List<T> lista) {

        if (!lista.isEmpty()) {
            return lista.get(lista.size() - 1);
        } else {
            return null;
        }

    }

    /**
     * Escribe una método que retorne la media de una lista de Double
     */
    public static double media(List<Double> lista) {

        double n = 0;

        for (int i = 0; i < lista.size(); i++) {
            n = +lista.get(i);
        }
        return n / lista.size();
    }

    /**
     * Escribe un método que retorne la cadena mas larga de una lista de String
     */
    public static String largo(List<String> lista) {

        if (lista.size() != 0) {
            String resultat = lista.get(0);
            for (int x = 0; x < lista.size(); x++) {
                if (lista.get(x).length() > resultat.length()) {
                    resultat = lista.get(x);
                }
            }
            return resultat;

        } else {
            return null;
        }
    }

    /**
     * Escribe un método que retorne el maximo de una lista de enteros
     */
    public static Integer maximo(List<Integer> lista) {

        if (lista.size() != 0) {

            int maximo = lista.get(0);

            for (int x = 0; x < lista.size(); x++) {
                if (lista.get(x) > maximo) {
                    maximo = lista.get(x);
                }
            }

            return maximo;

        } else {
            return null;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /*List<Estudiante> list = new ArrayList<>();
        
        list.add(new Estudiante("pepe", 34));
        list.add(new Estudiante("ana", 36));
        list.add(new Estudiante("joan", 14));
        list.add(new Estudiante("marc", 24));
        
        Collections.sort(list);
        System.out.println(list);*/
        
        /*List<Alumno> list = new ArrayList<>();
        
        list.add(new Alumno("pepe", 34));
        list.add(new Alumno("ana", 36));
        list.add(new Alumno("joan", 14));
        list.add(new Alumno("marc", 24));
        
        Collections.sort(list, new AlumnoEdadComparator());
        System.out.println(list);*/
        
        /*Map<Integer, Alumno> mapa = new HashMap<>();
        
        mapa.put(1, new Alumno("Alpha", 34));
        mapa.put(1, new Alumno("Alpha", 34));
        mapa.put(2, new Alumno("Jose", 44));
        mapa.put(3, new Alumno("Anna", 24));
        
        Set<Integer> claves = mapa.keySet();
        
        for (Iterator i = claves.iterator(); i.hasNext();){
           System.out.println(mapa.get(i.next()));
        }
        
        Collection<Alumno> col = mapa.values();
        
        for (Iterator i = col.iterator(); i.hasNext();){
           System.out.println(i.next());
        }
        
        List<String> lista = new ArrayList<>();
        
        lista.add("va?");
        lista.add("tal");
        lista.add("que");
        lista.add("Hola");
        
        Collections.reverse(lista);
        System.out.println(lista);
        
        List<Alumno> listaAlumno = new ArrayList();
        
        listaAlumno.add(new Alumno("Arnau", 23));
        listaAlumno.add(new Alumno("Ramon", 13));
        listaAlumno.add(new Alumno("Ferran", 33));
        listaAlumno.add(new Alumno("Juan", 24));
        
        Collections.sort(listaAlumno);
        System.out.println(listaAlumno);
         */
        //Alumno alumno = mapa.get(3);
        //System.out.println(alumno);
        /*Set<Alumno> set = new HashSet<>();
                
        set.add(new Alumno("Alpha", 34));
        set.add(new Alumno("Ramon", 24));
        set.add(new Alumno("Juan", 4));
        set.add(new Alumno("Pepe", 4));
        set.add(new Alumno("Al", 4));
        
       for (Iterator i = set.iterator(); i.hasNext(); ){
           System.out.println(i.next());
       }*/
 /*
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
         */
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
