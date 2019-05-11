/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

/**
 *
 * @author pedro
 */
public class ForEach {
    
      public static void main(String[] args) {
        imprimirEquipos("Chelsea","Liverpool","Manchester United","Aston Villa", "Liverpool");
    }
    
    public static void imprimirEquipos(String... equipos){
        int contador=1;
        for(String equipo: equipos){
            System.out.println("Equipo "+contador+": "+equipo);
            contador++;
        }
}
    
    
}
