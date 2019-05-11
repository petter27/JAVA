/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holam;

/**
 *
 * @author pedro
 */
public class operaciones {
    
    public static void main(String[] args) {
       
        double numero1=20.34;
        double numero2=19.66;
        double numeroExtra=36;
        
        System.out.println("La suma es "+(numero1+numero2) );
        System.out.println("La resta es "+(numero1-numero2) );
        System.out.println("La multiplicacion es "+(numero1*numero2) );
        System.out.println("La division es "+(numero1/numero2) );
        
        if(numeroExtra%2==0){
            System.out.println("El numero Extra es par");
        }else{
        System.out.println("El numero Extra es impar");
        }
    }
}
