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
public class rectangulo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Proporciona el alto:");
        double alto=Double.parseDouble((scanner.nextLine()));
        System.out.println("Proporciona el ancho:");
        double ancho=Double.parseDouble((scanner.nextLine()));
        System.out.println("Area:"+ (alto*ancho));
        System.out.println("Perimetro:"+((alto+ancho)*2));
        
        int numero=10;
        
       String resultado=(numero%2==0) ? "Par": "Impar";
        System.out.println(resultado);
    }
}
