/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

/**
 *
 * @author 2110137
 */
public class Cuadrado {
    
    private int valor;
    private int cuadrado;

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
        this.setCuadrado(valor*valor);
    }

    public int getCuadrado() {
        return cuadrado;
    }

    public void setCuadrado(int resultado) {
        this.cuadrado = resultado;
    }
    
}
