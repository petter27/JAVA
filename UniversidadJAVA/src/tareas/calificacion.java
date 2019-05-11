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
public class calificacion {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Proporciona un valor entre 0 y 10:");
        double calificacion = Double.parseDouble(scanner.nextLine());
        if (calificacion>=9 && calificacion<=10){
            System.out.println("A");
        }else if(calificacion>=8 && calificacion<9){
             System.out.println("B");
        }else if(calificacion>=7 && calificacion<8){
             System.out.println("C");
        }else if(calificacion>=6 && calificacion<7){
             System.out.println("D");
        }else if(calificacion>=0 && calificacion<6){
             System.out.println("F");
        }else{
            System.out.println("Valor desconocido");
        }
    }
}
