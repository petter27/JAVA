/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejousuarios;

import datos.UsuariosJDBC;
import domain.Usuario;
import java.util.List;

/**
 *
 * @author pedro
 */
public class ManejoUsuarios {
    public static void main(String[] args) {
        UsuariosJDBC usuariosJDBC=new UsuariosJDBC();
        List<Usuario> Usuarios=null;
        //usuariosJDBC.delete(2);
        
        Usuarios=usuariosJDBC.select();
        
        for(Usuario usuario:Usuarios){
            System.out.println(usuario);
        }
        
    }
}
