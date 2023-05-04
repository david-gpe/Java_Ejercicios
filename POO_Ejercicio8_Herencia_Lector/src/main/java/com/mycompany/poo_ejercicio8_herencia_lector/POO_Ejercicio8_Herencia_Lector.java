package com.mycompany.poo_ejercicio8_herencia_lector;

import java.io.IOException;
import logica.Lector;

public class POO_Ejercicio8_Herencia_Lector {

    public static void main(String[] args) {
        Lector l = new Lector();
        try{
            System.out.println("Escribe tu Nombre: ");
            String nombre= l.readLine();
            System.out.println("Escribe tu Edad: ");
            int edad= l.readInt();
            System.out.println("Te llamas " + nombre + " y tienes " + edad + " años ");
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }
}
