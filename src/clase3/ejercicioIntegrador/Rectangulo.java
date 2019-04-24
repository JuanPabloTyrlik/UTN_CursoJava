package clase3.ejercicioIntegrador;

public class Rectangulo extends FiguraGeometrica {
    double base, altura;

    @Override
    public double superficie() {
        return base*altura;
    }

    public Rectangulo(double base, double altura) {
        if (base != altura) {
            this.base = base;
            this.altura = altura;
        } else {
            System.out.println("La base debe ser diferente que la altura");
        }
    }
}
