package clase1;

public class CajaAhorro extends CuentaBancaria {
    public void extraer(double monto) {
        if (saldo >= monto) {
            saldo -= monto;
            System.out.println("Extracción realizada");
            System.out.println("Monto:\t"+monto);
            System.out.println("Saldo:\t"+saldo);
        } else {
            System.out.println("Extracción rechazada");
            System.out.println("Saldo Insuficiente");
        }
    }
}
