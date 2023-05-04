package logica;

import beans.Contacto;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class GestionContactos {
    HashMap<String,Contacto> agenda;
    public GestionContactos(){
        agenda = new HashMap<>();
    }
    
    public boolean agregar(String nombre, String email, int edad){
        if(!agenda.containsKey(email)){
            Contacto c = new Contacto(nombre, email, edad);
            agenda.put(email,c);
            return true;
        }else{
            return false;

        }        
    }
    
    public Contacto buscar(String email){
        Contacto c=null;
        if(agenda.containsKey(email)){
            c=agenda.get(email);
        }
        return  c;
    }
    
    public boolean eliminar(String email){
        if(agenda.containsKey(email)){
            agenda.remove(email);
            return true;
        }else{
            return false;

        }
    }
    
    public Contacto[] recuperarContacto(){
        Contacto[] existentes= new Contacto[agenda.size()];
        int i=0;
        Collection<Contacto> valores = agenda.values();
        for(Contacto con:valores){
            existentes[i]=con;
            i++;
        }
        return existentes;
    }
    
    public Contacto[] recuperarPorEdadMaxima(int edad){
        ArrayList<Contacto> auxiliar = new ArrayList<>();
        agenda.forEach((k,v)->{
            if(v.getEdad()<=edad){
                auxiliar.add(v);            
            }
        });
        return auxiliar.toArray(new Contacto[0]);
    }
}
