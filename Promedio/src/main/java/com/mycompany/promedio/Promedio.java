package com.mycompany.promedio;
import java.util.*;
public class Promedio {

    public static void main(String[] args) {
        String condicion = "S";
        
        while (condicion.equals("S")) {
            String  con="S";
            Scanner n = new Scanner(System.in);
            List<Integer> miLista = new ArrayList<Integer>();
            
            while(con.equals("S")){
                System.out.println("Introduce una calificacion");
                int n1 = n.nextInt();
                miLista.add(n1);
                
                System.out.println("Deseas agregar otra calificacion ");
                System.out.println("S/N ");
                con=n.next();            
            }     
            

            int Sumatoria = 0, Promedio = 0;
            for (int i = 0; i < miLista.size(); i++) {
                Sumatoria+=miLista.get(i);
             }
            
            Promedio= Sumatoria/miLista.size();
            //resultados
            System.out.println("El promedio es : " + Promedio
                   + " La cantidad de materias fueron : " + miLista.size()
                   + " las calificaciones proporcionados fueron : " + miLista);
            
            //Pregunta de continuacion
            System.out.println("Deseas realizar otra promedio ");
            System.out.println("S/N ");
            condicion=n.next();
        }
        System.out.println("Gracias!");    }
}
