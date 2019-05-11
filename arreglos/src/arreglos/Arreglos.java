/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

/**
 *
 * @author pedro
 */
public class Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String [] nombres;
        nombres=new String[10];
        nombres[0]="Pedro";
        nombres[1]="Juan";
        nombres[2]="David";
        nombres[3]="Ernesto";
        nombres[8]="Armando";
        
        int contador=0;
        System.out.println("NOMBRES");
        while(contador<nombres.length-1){
            if(nombres[contador]!=null){
            System.out.println(nombres[contador]);
            }
            contador++;
        }
        
        String equipos[]={"Barcelona","Ajax","Liverpool","Totenham"};
        
        System.out.println("\n");
        System.out.println("EQUIPOS");
        
        for(int i=0; i<equipos.length; i++){
            System.out.println(equipos[i]);
        }
        
        
        
        String numeros[]=new String[3];
        numeros[0]="uno";
        numeros[1]="Dos";
        numeros[2]="Tres";
        System.out.println("\n");
        System.out.println("NUMEROS");
        System.out.println(numeros[0]);
        System.out.println(numeros[1]);
        System.out.println(numeros[2]);
    }
    
}
