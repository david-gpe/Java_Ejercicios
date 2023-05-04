package com.mycompany.test;

import java.util.Scanner;

public class Test extends Thread 
{ 
    public static void main(String[] args) {
        int j = 0; 
        while( j == 0){
             Scanner scan = new Scanner(System.in);
            System.out.println("Introduce un numero");
            int i = scan.nextInt();
            System.out.println("Introduce un flotante");
            double d = scan.nextDouble();
            System.out.println("introduce una linea");
            String a = scan.next();
        
            String g = scan.nextLine();

            // Write your code here.
            String s = a + g;
            System.out.println("String: " + s);
            System.out.println("Double: " + d);
            System.out.println("Int: " + i);
        
            scan.close();
         }
        
        
    }
}
