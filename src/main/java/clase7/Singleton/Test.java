package clase7.Singleton;

public class Test {
    public static void main(String[] args) {
        FabricaAutos fabricaAutos = new FabricaAutos();
        Auto a = fabricaAutos.fabricar();
        System.out.println(a.getNumero());
        Auto b = fabricaAutos.fabricar();
        System.out.println(b.getNumero());

        FabricaAutos fabricaAutosLP = new FabricaAutos();
        Auto c = fabricaAutosLP.fabricar();
        System.out.println(c.getNumero());
    }
}
