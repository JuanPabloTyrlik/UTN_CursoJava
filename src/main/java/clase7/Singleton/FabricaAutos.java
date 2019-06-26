package clase7.Singleton;

public class FabricaAutos {
    int numeroAutos = 1;

    public Auto fabricar() {
        Auto aux = new Auto();
        aux.setNumero(NumeradorSingleton.getInstance().getNumero());
        numeroAutos++;
        return aux;
    }
}
