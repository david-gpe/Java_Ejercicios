package logica;

import beans.Movimiento;
import java.util.HashSet;

public class CuentaMovimientos extends CuentaLimitada {
    private HashSet<Movimiento> movs; 
    
    public CuentaMovimientos(double saldo, double limite) {
        super(saldo, limite);
        movs=new HashSet<>();
        
    }

    @Override
    public void extraer(double cantidad) {
        movs.add(new Movimiento(cantidad, "extraccion"));
        super.extraer(cantidad); 
        
    }

    @Override
    public void ingresar(double cantidad) {
        movs.add(new Movimiento(cantidad, "deposito"));
        super.ingresar(cantidad); 
    }
    
    public HashSet<Movimiento> getMovimientos(){
        
        return movs;
        
    }
    
    
    
}
