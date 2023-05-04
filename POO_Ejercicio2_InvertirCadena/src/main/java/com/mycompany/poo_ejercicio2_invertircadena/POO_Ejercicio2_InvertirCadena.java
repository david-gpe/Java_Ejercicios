
package com.mycompany.poo_ejercicio2_invertircadena;

import java.util.Scanner;

public class POO_Ejercicio2_InvertirCadena {

    public static void main(String[] args) {
        String cad;

        Scanner sn = new Scanner(System.in); 
        System.out.println("Introduce una cadena");
        cad=sn.nextLine();
        StringBuilder n;
        StringBuilder pr = new StringBuilder();
        pr.append(cad);
        n = pr.reverse();
        System.out.println(n);
    }
}
