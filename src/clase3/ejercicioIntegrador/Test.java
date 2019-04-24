package clase3.ejercicioIntegrador;

public class Test {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(3,new double[]{0,0});
        System.out.println(circulo.perimetro());
        System.out.println(circulo.superficie());

    }
}
