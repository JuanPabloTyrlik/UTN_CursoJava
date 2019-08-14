package clase5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class Agenda {
    private final Map<String, ArrayList<Persona>> agenda = new HashMap<>();

    void agregarPersonas(Persona persona) {
        if (agenda.containsKey(persona.getNombre().substring(0, 1))) {
            agenda.get(persona.getNombre().substring(0, 1)).add(persona);
        } else {
            agenda.put(persona.getNombre().substring(0, 1), new ArrayList<>());
            agenda.get(persona.getNombre().substring(0, 1)).add(persona);
        }
    }

    ArrayList<Persona> getPersonas(String letra) {
        if (agenda.containsKey(letra.substring(0, 1))) {
            return agenda.get(letra.substring(0, 1));
        } else {
            return new ArrayList<>();
        }
    }

}
