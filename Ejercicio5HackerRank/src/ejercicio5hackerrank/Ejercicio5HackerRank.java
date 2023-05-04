/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5hackerrank;

import java.util.Scanner;

/**
 *
 * @author gpema
 */
public class Ejercicio5HackerRank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                //Complete this line
                System.out.printf("%-14s %03d %n" , s1, x);
            }
            System.out.println("================================");
}
    
}
