package clase3.ejercicioIntegrador;

public class Triangulo extends FiguraGeometrica {
    private String nombre = "Triangulo";
    private double[] lados;

    public String getNombre() {
        return nombre;
    }

    @Override
    public double superficie() {
        double s = perimetro() / 2;
        return Math.sqrt(s * (s - lados[0]) * (s - lados[1]) * (s - lados[2]));
    }

    Triangulo(double[] lados) {
        if (lados.length == 3) {
            this.lados = lados;
        } else {
            System.out.println("Debe ingresar 3 lados");
        }
    }

    public double perimetro() {
        double perimetro = 0;
        for (double lado : lados) {
            perimetro += lado;
        }
        return perimetro;
    }
}
