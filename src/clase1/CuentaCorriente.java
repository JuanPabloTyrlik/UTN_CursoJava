package clase1;

public class CuentaCorriente extends CuentaBancaria{
    public void extraer(double monto) {
        saldo -= monto;
        System.out.println("Extracción realizada");
        System.out.println("Monto:\t"+monto);
        System.out.println("Saldo:\t"+saldo);
    }
}
