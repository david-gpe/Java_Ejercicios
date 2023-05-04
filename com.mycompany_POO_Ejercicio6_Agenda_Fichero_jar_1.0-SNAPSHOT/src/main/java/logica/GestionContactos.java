package logica;

import beans.Contacto;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class GestionContactos {
    String ruta ="C:\\Users\\gpema\\OneDrive\\Escritorio\\Cursos\\Curso POO\\contactos.txt";
    
    public boolean agregar(String nombre, String email, int edad){
        if(buscar(email)== null){
            Contacto c = new Contacto(nombre, email, edad);
            try(FileOutputStream fos = new FileOutputStream(ruta,true);
                    PrintStream salida = new PrintStream (fos)){
                salida.println(nombre + " " + edad + " " + email);
            }catch(Exception e){
                e.printStackTrace();
            }
            return true;
        }else{
            return false;

        }        
    }
    
    public Contacto buscar(String email){
        Contacto c=null;
        
        try(BufferedReader bf = new BufferedReader(new FileReader(ruta))){
            String s;
            while((s=bf.readLine()) != null){
                String[] datos=s.split("[|]");
                if(datos[2].equals(email)){
                    c=new Contacto(datos[0], datos[2],Integer.parseInt(datos[1]));
                    break;
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        
        return  c;
    }
    
    public boolean eliminar(String email){
        boolean res = false;
        Contacto[] todos = recuperarContacto();
        try(PrintStream out = new PrintStream(ruta);){
            for(Contacto c:todos){
                if(!email.equals(c.getEmail())){
                    out.println(c.getNombre()+" | "+ c.getEdad() + " | " + c.getEmail());
                }else{
                    res=true;
                }
            }
        }catch(IOException ex){
            ex.printStackTrace();
        }
        return res;
    }
    
    public Contacto[] recuperarContacto(){
        ArrayList <Contacto> existentes= new ArrayList<>();
        Contacto c =null;
        
        try(BufferedReader bf = new BufferedReader(new FileReader(ruta));){
            String s;
            while((s=bf.readLine())!=null){
                String[] datos=s.split("[|]");
                c=new Contacto(datos[0], datos[2],Integer.parseInt(datos[1]));
            }
        }catch(IOException ex){
            ex.printStackTrace();
        }
        return existentes.toArray(new Contacto[0]);
    }
}
