package clase3.ejercicioIntegrador;

public class Cuadrado extends FiguraGeometrica {
    double base, altura;

    @Override
    public double superficie() {
        return Math.pow(base,2);
    }

    public Cuadrado(double base, double altura) {
        if (base == altura) {
            this.base = base;
            this.altura = altura;
        } else {
            System.out.println("La base debe ser igual que la altura");
        }
    }
}
