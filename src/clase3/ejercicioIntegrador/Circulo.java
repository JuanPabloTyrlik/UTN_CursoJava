package clase3.ejercicioIntegrador;

public class Circulo extends FiguraGeometrica {
    double radio;
    double[] centro;
    @Override
    public double superficie() {
        return Math.PI*Math.pow(radio,2);
    }

    @Override
    public double perimetro(double[] lados) {
        return perimetro();
    }

    public double perimetro() {
        return 2*Math.PI*radio;
    }

    public Circulo(double radio, double[] centro) {
        if (radio > 0 && centro.length >=2) {
            this.radio = radio;
            this.centro = centro;
        } else {
            System.out.println("Debe indicar un centro y un radio > 0");
        }
    }
}
