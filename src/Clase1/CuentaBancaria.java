package Clase1;

public abstract class CuentaBancaria {
    protected Titular titular;
    protected double saldo;

    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double monto) {
        saldo += monto;
        System.out.println("Deposito realizado");
        System.out.println("Monto:\t"+monto);
        System.out.println("Saldo:\t"+saldo);
    }

    public abstract void extraer(double monto);

}
