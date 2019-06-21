/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import java.lang.reflect.Array;
import java.util.Scanner;

/**
 *
 * @author pedro
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int numero;
        int cantidadUno=0;
        String primerValor="";
        String numeroBinario="";
        String[] arreglo=new String[3];
        boolean limite=false;
        String reverse="";
        System.out.println("Ingresa un numero: ");
        numero=Integer.parseInt(scanner.nextLine());
        System.out.println("Numero ingresado es: "+numero);
        while(numero>=2){
         if(numero%2==0){
             numeroBinario+="0";
         }else{
              numeroBinario+="1";
         }
         numero=numero/2;
        }
        numeroBinario = (numero==1) ? (numeroBinario+="1") : (numeroBinario+="0");
      for(int i=numeroBinario.length()-1; i>=0; i--){
          if(numeroBinario.charAt(i)==(char)'1'){
              cantidadUno++;
          }
            reverse+=numeroBinario.charAt(i);
      }
      primerValor=Character.toString(reverse.charAt(0));
      arreglo[0]=reverse;
      arreglo[1]=primerValor;
      arreglo[2]= Integer.toString(cantidadUno);
        System.out.println("Numero binario: "+reverse);
        System.out.println("Primer valor: "+primerValor);
        System.out.println("Cantidad de unos: "+cantidadUno);
        
    }
    
}
