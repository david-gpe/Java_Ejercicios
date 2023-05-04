package com.mycompany.poo_ejercicio7_herencia_cuenta;

import beans.Movimiento;
import java.util.HashSet;
import logica.CuentaMovimientos;

public class POO_Ejercicio7_Herencia_Cuenta {

    public static void main(String[] args) {
        CuentaMovimientos cm = new CuentaMovimientos(200, 100);
        cm.ingresar(50);
        cm.extraer(70);
        System.out.println("Saldo actual " + cm.getSaldo());
        HashSet<Movimiento> movimientos= cm.getMovimientos();
        System.out.println("Historial de ingresos y egresos ");
        for(Movimiento m:movimientos){
            System.out.println("Cantidad " + m.getCantidad() + " Tipo de Movimiento " + m.getTipo());
        }
    }
}
