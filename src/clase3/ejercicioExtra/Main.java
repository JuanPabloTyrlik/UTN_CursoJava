package clase3.ejercicioExtra;

class Main {
    public static void main(String[] args) {
        Avion avion = new Avion();
        Edificio edificio = new Edificio();
        Nube nube = new Nube();
        System.out.println("Nube: "+avion.atravezar(nube));
        System.out.println("Edificio: "+avion.atravezar(edificio));
    }
}
