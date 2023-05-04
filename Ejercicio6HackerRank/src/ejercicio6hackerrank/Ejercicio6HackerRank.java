/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6hackerrank;

import java.io.BufferedReader;
import java.io.IOException;

/**
 *
 * @author gpema
 */
public class Ejercicio6HackerRank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReaderreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
 
                for(int i = 1; i<=10; i++){
                    System.out.println(N + " x " + i + " = " + N*i);
                    }

        bufferedReader.close();
    }
    
}
