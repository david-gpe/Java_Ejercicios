/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3.pkg0hackerrank;

import java.util.Scanner;

/**
 *
 * @author gpema
 */
public class Ejercicio30HackerRank {

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if(1<= N && N<=100){
            
            if(N % 2 != 0){
                System.out.println("Weird");
            }else if(N % 2==0 && N >=2 && N<= 5){
                    System.out.println("Not Weird");
                }else if(N % 2==0 && N >=6 && N<= 20){
                    System.out.println("Weird");
                }else if(N % 2==0 && N >=20){
                    System.out.println("Not Weird");
                }
            
            
        }        
        scanner.close();
    }
    
}
