package clase3.ejercicioIntegrador;

public class Triangulo extends FiguraGeometrica {
    double[] lados;

    @Override
    public double superficie() {
        double s = perimetro(lados)/2;
        return Math.sqrt(s*(s-lados[0])*(s-lados[1])*(s-lados[2]));
    }

    public Triangulo(double[] lados) {
        if (lados.length == 3) {
            this.lados = lados;
        } else {
            System.out.println("Debe ingresar 3 lados");
        }
    }
}
