package clase3.ejercicioIntegrador;

public abstract class FiguraGeometrica {
    public double perimetro(double[] lados) {
        double perimetro = 0;
        for (double lado : lados) {
            perimetro += lado;
        }
        return perimetro;
    }
    public abstract double superficie();

}
