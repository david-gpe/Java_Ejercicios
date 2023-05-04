package com.mycompany.sumatorian;

import java.util.Scanner;

public class SumatoriaN {
    
    public static void main(String[] args) {
    String condicion="S";
    
    while(condicion.equals("S")){
         int Vinicial=0, Vfinal=0, inc=0, sumatoria=0;
            Scanner n = new Scanner(System.in);
        System.out.println("Introduce el valor inicial");
            Vinicial=n.nextInt();
        System.out.println("Introduce el valor final");
            Vfinal=n.nextInt();
        System.out.println("Introduce el incremento");
            inc=n.nextInt();
            
            for(int i = Vinicial; i<= Vfinal; i+=inc){
                sumatoria+=i;
                System.out.println("Valor inicial: " + Vinicial + 
                        " Valor final: " + Vfinal + 
                        " Incremento: " + inc +
                        " Sumatoria: " + sumatoria);
            }
            
            
            System.out.println("Deseas realizar otra sumatoria ");
            System.out.println("S/N ");
            condicion=n.next();
        }
        System.out.println("Gracias!");
    }
}
