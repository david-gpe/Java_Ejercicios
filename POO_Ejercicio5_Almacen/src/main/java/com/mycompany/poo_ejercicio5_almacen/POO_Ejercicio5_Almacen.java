package com.mycompany.poo_ejercicio5_almacen;

import beans.Pieza;
import java.text.DateFormat;
import static java.text.DateFormat.FULL;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import logica.GestionPiezas;

public class POO_Ejercicio5_Almacen {

    public static void main(String[] args) {
        GestionPiezas gestor = new GestionPiezas();
        Scanner n = new Scanner(System.in);
        int op = 0, dia, mes, year;
        String nombre;
        do{
            System.out.println("1. Añadir piezas");            
            System.out.println("2. Piezas antiguas");            
            System.out.println("3. Salir");            
            op=Integer.parseInt(n.nextLine());
            switch (op) {
                case 1:
                    System.out.println("Nombre de la pieza");
                    nombre = n.nextLine();
                    System.out.println("Año de fabricacion: ");
                    year = Integer.parseInt(n.nextLine());
                    System.out.println("Mes de fabricacion(1-12): ");
                    mes= Integer.parseInt(n.nextLine());
                    System.out.println("Dia de fabricacion: ");
                    dia=Integer.parseInt(n.nextLine());
                    
                    Calendar cal = Calendar.getInstance();
                    cal.set(year, mes-1, dia);
                    gestor.agregarPieza(nombre, cal.getTime());
                    break;
                case 2:
                    System.out.println("Año de fabricación");
                    year= Integer.parseInt(n.nextLine());
                    System.out.println("Mes de fabricación");
                    mes= Integer.parseInt(n.nextLine());
                    System.out.println("Dia de fabricación");
                    dia= Integer.parseInt(n.nextLine());
                    
                    Calendar cal1= Calendar.getInstance();
                    cal1.set(year, mes-1,dia);
                    HashSet<Pieza> piezas=gestor.obtenerAntiguas(cal1.getTime());
                    for(Pieza p:piezas){
                        DateFormat df= DateFormat.getDateInstance(DateFormat.FULL, new Locale("ES","es"));
                        System.out.println(p.getNombre() + " " + df.format(p.getFechaFabricacion()));  
                    }
                    break;
                default:
                    throw new AssertionError();
            }
        }while(op!=3);
        
    }
}
