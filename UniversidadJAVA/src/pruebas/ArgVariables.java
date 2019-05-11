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
public class ArgVariables {
    public static void main(String[] args) {
        imprimirEquipos("Chelsea","Liverpool","Manchester United","Aston Villa", "Liverpool");
    }
    
    public static void imprimirEquipos(String... equipos){
        for(int i=0; i<equipos.length; i++){
            System.out.println("Equipo "+i+": "+equipos[i]);
        }
}

}

