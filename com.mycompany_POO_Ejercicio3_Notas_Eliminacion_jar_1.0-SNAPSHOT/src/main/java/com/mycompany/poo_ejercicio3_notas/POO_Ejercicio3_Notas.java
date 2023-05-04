package com.mycompany.poo_ejercicio3_notas;

import java.util.Scanner;
import logica.GestionNotas;

public class POO_Ejercicio3_Notas {

    public static void main(String[] args) {
        GestionNotas gnotas = new GestionNotas();
        int opci = 0;
        Scanner n = new Scanner(System.in);
        double nota;
        
        do{
            System.out.println("1. Añadir nota");
            System.out.println("2. Ver media");
            System.out.println("3. Ver aprobados");
            System.out.println("4. Ver ordenados");
            System.out.println("5. Finalizar");
            opci=Integer.parseInt(n.nextLine()); 
            
            switch(opci){
                case 1: System.out.println("Introduce Nota");
                        nota = Double.parseDouble(n.nextLine());
                        gnotas.guardarNota(nota);
                        break;
                case 2: System.out.println("Media actual: " + gnotas.media());
                break;
                
                case 3: System.out.println("Los cantidad de aprobados es: " + gnotas.aprobados());
                break;
                case 4:
                    Double[] todas=gnotas.recuperarNotas();
                    for(Double d:todas){
                        System.out.println(d +" , " );
                    }
                    System.out.println(" ");
            }
        }while(opci!=5);        
    }
}
