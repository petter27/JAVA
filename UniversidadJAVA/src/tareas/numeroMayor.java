/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareas;

import java.util.Scanner;

/**
 *
 * @author pedro
 */
public class numeroMayor {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Proporciona el numero1:");
        int num1=Integer.parseInt(scanner.nextLine());
        System.out.println("Proporciona el numero2:");
        int num2=Integer.parseInt(scanner.nextLine());
        if(num1>num2){
        System.out.println("El numero mayor es:");
        System.out.println(num1);
        }else{
         System.out.println("El numero mayor es:");
        System.out.println(num2);
        }
    }
}
