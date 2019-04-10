package Clase3;

public class Main {
    public static void main(String[] args) {
        Libro libro1 = new Libro("978-987-8304-36-6", "La vuelta al mundo en 80 dias", "Julio Verne", 270);
        Libro libro2 = new Libro("978-987-613-205-3", "Viaje al centro de la Tierra", "Julio Verne",296);
        System.out.println(libro1.toString());
        System.out.println(libro2.toString());
        if (libro1.getPags() > libro2.getPags()) {
            System.out.println("El libro '"+libro1.getTitulo()+"' tiene más páginas.");
        } else {
            if (libro1.getPags() == libro2.getPags()) {
                System.out.println("Ambos libros tienen la misma cantidad de páginas.");
            } else {
                System.out.println("El libro '"+libro2.getTitulo()+"' tiene más páginas.");
            }
        }
    }
}
