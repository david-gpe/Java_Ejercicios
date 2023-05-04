package com.mycompany.comparacion;

import java.util.*;

public class Comparacion {

    public static void main(String[] args) {
        String condicion = "S";

        while (condicion.equals("S")) {
            Scanner n = new Scanner(System.in);
            List<Integer> miLista = new ArrayList<Integer>();
            
            System.out.println("Introduce el primer numero");
            int n1 = n.nextInt();
            miLista.add(n1);
            System.out.println("Introduce el segundo numero");
            int n2 = n.nextInt();
            miLista.add(n2);
            System.out.println("Introduce el tercer numero");
            int n3 = n.nextInt();
            miLista.add(n3);

            int Vactual = 0, Vmayor = 0, Vmenor = 0;
            for (int i = 0; i < miLista.size(); i++) {
                Vactual = miLista.get(i);
               
                if (Vmayor == 0 & Vmenor == 0) {
                    Vmenor = Vactual;
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
