package clase4.Ejercicio;

import java.util.ArrayList;
import java.util.List;

class Main {
    public static void main(String[] args) {
        List<Persona> personas = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            personas.add(new Persona("Nombre" + i, "Apellido" + i, "" + i));
        }
        for (Persona persona : personas) {
            System.out.println(persona.imprimir());
        }
        System.out.println();
        List<Persona> inverso = Persona.invertir(personas);
        for (Persona personai : inverso) {
            System.out.println(personai.imprimir());
        }
    }
}

