package varios;

import auxiliar.Proceso;

public class Mesa implements Proceso{
    private int ancho;
    private int largo;

    public Mesa(int ancho, int largo) {
        this.ancho = ancho;
        this.largo = largo;
    }
    
    
    @Override
    public void imprimir() {
        System.out.println("El ancho es: " + ancho + " El largo es: " + largo);
        
    }

    @Override
    public void aumentar(int c) {
        ancho += c;
        largo +=c;
    }
    
}
