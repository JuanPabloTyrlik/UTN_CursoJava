package clase3;

public class Main {
    public static void main(String[] args) {

        System.out.println();

        Libro libro1 = new Libro("978-987-8304-36-6", "La vuelta al mundo en 80 dias", "Julio Verne", 270);
        Libro libro2 = new Libro("978-987-613-205-3", "Viaje al centro de la Tierra", "Julio Verne",296);
        System.out.println(libro1.toString());
        System.out.println(libro2.toString());
        if (libro1.getPags() > libro2.getPags()) {
            System.out.println("El libro '"+libro1.getTitulo()+"' tiene mas paginas.\n");
        } else {
            if (libro1.getPags() == libro2.getPags()) {
                System.out.println("Ambos libros tienen la misma cantidad de paginas.\n");
            } else {
                System.out.println("El libro '"+libro2.getTitulo()+"' tiene mas paginas.\n");
            }
        }

        Piano piano =new Piano();
        piano.setNombre("piano");
        piano.setTipo("cuerda");
        piano.tocar();

        Guitarra guitarra = new Guitarra();
        guitarra.setNombre("guitarra");
        guitarra.setTipo("cuerda");
        guitarra.tocar();

        Trompeta trompeta = new Trompeta();
        trompeta.setNombre("trompeta");
        trompeta.setTipo("aire");
        trompeta.tocar();
        System.out.println();

        Tanque tanque = new Tanque(100, "Nafta", 10);
        Automovil naftero = new Automovil("FORD", "Focus", 2010, tanque);
        System.out.println(naftero.hacerKM(40));

        Tanque tanque2 = new Tanque(100, "Gasoil", 5);
        Automovil gasolero = new Automovil("Ford", "Focus", 2010, tanque2);
        System.out.println(gasolero.hacerKM(37.5));
        System.out.println();        
        
        Guerrero guerrero = new Guerrero();
        System.out.println(guerrero.atacar()+"\n");
        Elfo elfo = new Elfo();
        System.out.println(elfo.atacar()+"\n");
        Enano enano = new Enano();
        System.out.println(enano.atacar()+"\n");
        Mago mago = new Mago();
        System.out.println(mago.atacar()+"\n");
        
        Personaje.luchar(guerrero, mago);
        System.out.println();
        Personaje.luchar(elfo, enano);
        System.out.println();
        Personaje.luchar(guerrero, enano);
        System.out.println();
        Personaje.luchar(elfo, mago);
        System.out.println();
        Avion avion = new Avion();
        Edificio edificio = new Edificio();
        Nube nube = new Nube();
        System.out.println("Nube: "+avion.atravezar(nube));
        System.out.println("Edificio: "+avion.atravezar(edificio));
        
    }
}
