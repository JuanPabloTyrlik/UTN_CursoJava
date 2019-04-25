package clase3.ejercicioIntegrador;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<FiguraGeometrica> figurasGeometricas = new ArrayList<>();
        figurasGeometricas.add(new Cuadrado(1,1));
        figurasGeometricas.add(new Triangulo(new double[]{3,4,5}));
        figurasGeometricas.add(new Rectangulo(2,1));
        figurasGeometricas.add(new Circulo(1,new double[]{0,0}));

        for (FiguraGeometrica figurasGeometrica : figurasGeometricas) {
            System.out.println(figurasGeometrica.getNombre()+":");
            System.out.println("\tPerimetro: "+figurasGeometrica.perimetro());
            System.out.println("\tArea: "+figurasGeometrica.superficie());
            System.out.println();
        }

    }
}
