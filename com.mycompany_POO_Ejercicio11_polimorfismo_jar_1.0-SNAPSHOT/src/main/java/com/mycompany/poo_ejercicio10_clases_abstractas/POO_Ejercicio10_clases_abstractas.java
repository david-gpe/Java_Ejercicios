package com.mycompany.poo_ejercicio10_clases_abstractas;

import logica.Circulo;
import logica.Figura;
import logica.Triangulo;

public class POO_Ejercicio10_clases_abstractas {

    public static void main(String[] args) {
        mostrarDatosFigura(new Triangulo("Rojo", 6, 2));
        
        mostrarDatosFigura(new Circulo("Verde", 10));
    }
    
    private static void mostrarDatosFigura(Figura f){
         System.out.println("Color: " + f.getColor());
         System.out.println("Superficie: " + f.superficie());
    }
}
