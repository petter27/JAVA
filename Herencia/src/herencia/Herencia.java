/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

import clases.Cliente;
import clases.Empleado;
import java.util.Date;

/**
 *
 * @author pedro
 */
public class Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Empleado emp1=new Empleado("pedro",850);
        emp1.setEdad(22);
        emp1.setGenero('M');
        emp1.setDireccion("Santa Ana");
        System.out.println("Empleado"+emp1);
        
        Cliente cli=new Cliente(new Date(),true);
        cli.setNombre("Osvaldo");
        cli.setGenero('M');
        cli.setDireccion("Santa Ana");
        System.out.println("Cliente "+cli);
    }
    
}
