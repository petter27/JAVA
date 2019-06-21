/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

function validarForma(forma){
    var usuario= forma.usuario;
    if(usuario.value==""){
        alert("Debe proporcionar un nombre de usuario");
        usuario.focus();
        usuario.select();
        return false;
    }
    
    var password = forma.password;
    if(password.value=="" || password.value.length<3 ){
        alert("Debe proporcionar una contraseña valida");
        password.focus();
        password.select();
        return false;
    }
    
    var tecnologias= forma.tecnologia;
    var checkSeleccionado=false;
    for(var i=0; i<tecnologias.length; i++){
        if(tecnologias[i].checked){
            checkSeleccionado=true;
        }
    }
    if(!checkSeleccionado){
        alert("Debe seleccionar una tecnología");
        return false;
    }
    
    var generos=forma.genero;
    var radioSeleccionado = false;
    
    for(i=0; i<generos.length; i++){
        if(generos[i].checked){
            radioSeleccionado=true;
        }
        if(!radioSeleccionado){
        alert("Debe seleccionar su genero");
        return false;
    }
    }
    
    var ocupacion = forma.ocupacion;
    if(ocupacion.value==""){
        alert("Debe seleccionar una ocupacion");
        return false;
    }
    return true;
}

