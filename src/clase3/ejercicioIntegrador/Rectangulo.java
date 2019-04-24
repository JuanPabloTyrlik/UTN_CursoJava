package clase3.ejercicioIntegrador;

public class Rectangulo extends FiguraGeometrica {
    public String nombre = "Rectangulo";
    double base, altura;

    public String getNombre() {
        return nombre;
    }

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
    public double perimetro() {
        return 2*(base+altura);
    }
}
