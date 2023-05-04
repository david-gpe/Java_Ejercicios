package com.mycompany.poo_ejercicio4_agenda;

import beans.Contacto;
import java.util.Scanner;
import logica.GestionContactos;

public class POO_Ejercicio4_Agenda {

    public static void main(String[] args) {
        GestionContactos gestor = new GestionContactos();
        Scanner sc =new Scanner(System.in);
        int op = 0, edad;
        String nombre, email;
        
        do{
            System.out.println("1. Añadir contacto ");
            System.out.println("2. Buscar contacto ");
            System.out.println("3. Eliminar contacto ");
            System.out.println("4. Buscar contactos ");
            System.out.println("5. Finltrar por edad ");
            System.out.println("6. Finalizar ");
            
            op= Integer.parseInt(sc.nextLine());
            
            switch (op) {
                case 1:
                    System.out.println("Ingresa el nombre");
                    nombre = sc.nextLine();
                    System.out.println("Ingresa el email");
                    email = sc.nextLine();
                    System.out.println("Ingresa la edad");
                    edad=Integer.parseInt(sc.nextLine());
                    gestor.agregar(nombre, email, edad);
                    break;
                    
                case 2:
                    System.out.println("Proporciona el email");
                    email=sc.nextLine();
                    Contacto c = gestor.buscar(email);
                    if(c==null){
                        System.out.println("El contacto no ha sido encontrado");
                    }else{
                        System.out.println(c.getNombre()+ " " + c.getEmail() + " " + c.getEdad());
                    }
                    break;
                    
                case 3:
                    System.out.println("Proporciona el email");
                    email=sc.nextLine();
                    if(gestor.eliminar(email)){
                        System.out.println("Contacto eliminado exitosamente");
                    }else{
                        System.out.println("Contacto no encontrado");
                    }
                    break;
                    
                case 4:
                    Contacto[] todos = gestor.recuperarContacto();
                    for(Contacto con: todos){
                        System.out.println(con.getNombre()+ " " + con.getEmail() + " " + con.getEdad());
                    }
                    break;
                    
                case 5:
                    System.out.println("Introduce la edad maxima");
                    edad=Integer.parseInt(sc.nextLine());
                    Contacto[] filtro = gestor.recuperarPorEdadMaxima(edad);
                    for(Contacto con:filtro){
                        System.out.println(con.getNombre() + " " + con.getEmail() + " " + con.getEdad());
                    }
                    break;
                case 6:
                    break;
                default:
                    System.out.println("La opción no es valida");
            }
            
        }while(op!=6);
        
    }
}
