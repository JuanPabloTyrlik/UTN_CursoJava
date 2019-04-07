package Clase1;

import Clase1.*;

public class Main {
    public static void main(String[] args) {
        Titular titular = new Titular("Juan Pablo", "Tyrlik", 37880970);

        System.out.println("Creando Cuenta Corriente...");
        CuentaBancaria cuentaCorriente = new CuentaCorriente();
        System.out.println("Cuenta Corriente creada");
        cuentaCorriente.setTitular(titular);
        System.out.println("Clase1.Titular:\t" + titular.getNombre() + " " + titular.getApellido());
        cuentaCorriente.depositar(1000);
        cuentaCorriente.extraer(500);
        cuentaCorriente.extraer(700);
        System.out.println();

        System.out.println("Creando Caja Ahorro...");
        CuentaBancaria cajaAhorro = new CajaAhorro();
        System.out.println("Caja de Ahorro creada");
        cajaAhorro.setTitular(titular);
        System.out.println("Clase1.Titular:\t" + titular.getNombre() + " " + titular.getApellido());
        cajaAhorro.depositar(1000);
        cajaAhorro.extraer(1100);
        cajaAhorro.extraer(1000);
        System.out.println();

        System.out.println("Creando Caja Especial...");
        CuentaBancaria cajaEspecial = new CajaEspecial();
        System.out.println("Caja Especial creada");
        cajaEspecial.setTitular(titular);
        System.out.println("Clase1.Titular:\t" + titular.getNombre() + " " + titular.getApellido());
        cajaEspecial.depositar(1000);
        cajaEspecial.extraer(1200);
        cajaEspecial.extraer(1100);
        System.out.println();
    }
}
