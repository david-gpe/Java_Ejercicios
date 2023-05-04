package com.mycompany.poo_ejercicio7_herencia_cuenta;

import logica.CuentaLimitada;

public class POO_Ejercicio7_Herencia_Cuenta {

    public static void main(String[] args) {
        CuentaLimitada c1 = new CuentaLimitada(100, 70);
        c1.extraer(90);
        System.out.println(c1.getSaldo());
    }
}
