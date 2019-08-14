package clase1;

abstract class CuentaBancaria {
    private Titular titular;
    double saldo;

    public Titular getTitular() {
        return titular;
    }

    void setTitular(Titular titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    void depositar(double monto) {
        saldo += monto;
        System.out.println("Deposito realizado");
        System.out.println("Monto:\t" + monto);
        System.out.println("Saldo:\t" + saldo);
    }

    public abstract void extraer(double monto);

}
