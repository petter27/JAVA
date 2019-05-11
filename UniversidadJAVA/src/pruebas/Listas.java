/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author pedro
 */
public class Listas {
    public static void main(String[] args) {
        List lista=new ArrayList();
        int numero=1;
        String cadena="hola";
        
        lista.add(numero);
        lista.add(cadena);
        
        System.out.println("Esto es un numero: "+lista.get(0));
        System.out.println("Esto es una cadena: "+lista.get(1));
        
        //ejemplo de HashMap
        //permite trabajar con valores y asignarles una llave
        
        HashMap mimapa=new HashMap();
        mimapa.put(1, "uno");
        mimapa.put(2, "dos");
        mimapa.put("otro","cualquier cosa");
        
        System.out.println(mimapa.get(1));
        System.out.println(mimapa.get("otro"));
        
    }
}
