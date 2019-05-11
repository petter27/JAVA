/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericos;

/**
 *
 * @author pedro
 */
public class Genericos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        claseGenericas<Integer> objG=new claseGenericas<>(15);
        objG.obtenerTipo();
    }
    
}
