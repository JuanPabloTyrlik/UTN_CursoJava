package clase3.ejercicioIntegrador;

public class Circulo extends FiguraGeometrica {
    private String nombre = "Circulo";
    private double radio;
    private double[] centro;

    public String getNombre() {
        return nombre;
    }

    @Override
    public double superficie() {
        return Math.PI * Math.pow(radio, 2);
    }

    public double perimetro() {
        return 2 * Math.PI * radio;
    }

    Circulo(double radio, double[] centro) {
        if (radio > 0 && centro.length >= 2) {
            this.radio = radio;
            this.centro = centro;
        } else {
            System.out.println("Debe indicar un centro y un radio > 0");
        }
    }
}
