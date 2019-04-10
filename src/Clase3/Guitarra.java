package Clase3;

public class Guitarra extends Instrumento{
    @Override
    public void tocar() {
        System.out.println("Tocando una "+super.getNombre());
    }
}
