package com.mycompany.comparacionn;
import java.util.*;

public class ComparacionN {

    public static void main(String[] args) {
        String condicion = "S";
        
        while (condicion.equals("S")) {
            String  con="S";
            Scanner n = new Scanner(System.in);
            List<Integer> miLista = new ArrayList<Integer>();
            
            while(con.equals("S")){
                System.out.println("Introduce un valor");
                int n1 = n.nextInt();
                miLista.add(n1);
                
                System.out.println("Deseas agregar otro valor ");
                System.out.println("S/N ");
                con=n.next();            
            }     
            

            int Vactual = 0, Vmayor = 0, Vmenor = 0;
            for (int i = 0; i < miLista.size(); i++) {
                Vactual = miLista.get(i);
               
                if (Vmayor == 0 & Vmenor == 0) {
                    Vmenor = Vactual;
                    Vmayor= Vactual;
                }

                if (Vactual > Vmayor) {
                    Vmayor = Vactual;
                } else {
                    if (Vactual < Vmenor) {
                        Vmenor = Vactual;
                    } else {
                        System.out.println("no es mayor");
                    }
                }

            }
            //resultados
            System.out.println("El mayor es : " + Vmayor
                    + " El menor es : " + Vmenor
                    + " los numero proporcionados fueron : " + miLista);
            
            //Pregunta de continuacion
            System.out.println("Deseas realizar otra sumatoria ");
            System.out.println("S/N ");
            condicion=n.next();
        }
        System.out.println("Gracias!");
    }
}
