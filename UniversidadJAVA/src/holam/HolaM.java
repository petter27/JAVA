/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holam;

import java.util.Scanner;



/**
 *
 * @author pedro
 */
public class HolaM {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    boolean comprobar=false;
    boolean primeraVez=true;
    while(!comprobar){
        if(primeraVez){
            System.out.println("BIENVENIDO ");
            System.out.println("Ingese su Edad: ");
            primeraVez=false;
        }else{
            System.out.println("Ingese su Edad: ");
        }
    Scanner scanner=new Scanner(System.in);
      int edad= Integer.parseInt((scanner.nextLine()));
      boolean adulto= edad>=18;
      if(adulto){
          System.out.println("Eres mayor de edad, Puedes Pasar");
          comprobar=true;     
      }else{
          System.out.println("Eres menor de edad");
          comprobar=false;
          System.out.print("\033[H\033[2J");
          System.out.flush();
      }    
    }  
}
}



//     String saludo= "bienvenido XD";
//       System.out.println(saludo);
//       System.out.println();
//        System.out.println("Ingese su nombre: ");
//    Scanner scanner =new Scanner(System.in);
//    String usuario=scanner.nextLine();
//        System.out.println("Saludos "+usuario);
//        byte bw=0xa;
//        System.out.println("Saludos "+bw);12
