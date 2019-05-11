/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author pedro
 */
public class division {
    private int numerador;
    private int denominador;
    
    public division(int numerador, int denominador) throws OperationException{
        
        if (denominador==0){
            throw new OperationException("Denominador igual a 0");
        }
        this.numerador=numerador;
        this.denominador=denominador;
    }
    
    public void visualizarOperacion(){
        System.out.println("El resultado de la division es: "+ (numerador/denominador));
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }
    
    
}
