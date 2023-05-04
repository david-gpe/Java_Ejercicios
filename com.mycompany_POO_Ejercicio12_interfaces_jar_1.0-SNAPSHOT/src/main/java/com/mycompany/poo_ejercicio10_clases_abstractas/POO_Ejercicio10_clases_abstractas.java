package com.mycompany.poo_ejercicio10_clases_abstractas;

import auxiliar.Proceso;
import logica.Circulo;
import logica.Figura;
import logica.Triangulo;
import varios.Mesa;

public class POO_Ejercicio10_clases_abstractas {

    public static void main(String[] args) {
        mostrarDatosFigura(new Circulo("Verde", 10));
        mostrarDatosFigura(new Mesa(6, 2));
    }
    
    private static void mostrarDatosFigura(Proceso op){
        op.aumentar(3);
        op.imprimir();
        op.firmar();
    }

}
