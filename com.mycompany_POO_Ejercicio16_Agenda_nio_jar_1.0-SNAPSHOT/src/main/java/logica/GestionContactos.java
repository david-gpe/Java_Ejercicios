package logica;

import beans.Contacto;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.stream.Stream;

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
        Path pt=Paths.get(ruta);
        try(Stream<String> st = Files.lines(pt)){
            String[] res=st.map(s->s.split("[|]")).filter(d->d[2].equals(email)).findFirst().orElseGet(null);
            if(res!=null){
                c=new Contacto(res[0],res[2],Integer.parseInt(res[1]));
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
        Contacto[] contactos =null;
        Path pt=Paths.get(ruta);
        try(Stream<String> st=Files.lines(pt)){
            contactos=st.map(s->s.split("[|]"))
                    .map(d->new Contacto(d[0], d[2], Integer.parseInt(d[1]))).toArray(t->new Contacto[t]);
            
        }catch(IOException ex){
            ex.printStackTrace();
        }
        return contactos;
    }
}
