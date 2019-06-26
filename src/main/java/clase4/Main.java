package clase4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;


class Main {
    public static void main(String[] args) {
/*
        Colecciones:
            Array   -> Tamaño definido
                    -> Acceso Aleatorio
                    -> Se pueden crear de un solo tipo de objeto
            Auto[] autos;
            Auto[] autos = new Auto[5];
            autos[i] -> indice va de 0 a n-1, siendo n la longitud del array
*/

        int[] enteros = {1,2,3,4,5};
        int[] enteros2 = new int[5];
        for (int i = 0; i < enteros2.length; i++) {
            enteros2[i] = i;
        }
        System.out.println("Array enteros: "+Arrays.toString(enteros));
        System.out.println("Array enteros2: "+Arrays.toString(enteros2)+"\n");

/*
        Interfaces:
                -> (Ver PDF en Drive)
            Class Ballena extends Mamifero implements Acuatico {...}

            Desacoplamiento:
                Acuatico a = new Ballena(); Interfaz Acuatico.
                Acuatico b = new Pecesito();
*/
        InstrumentoMusical viento = new InstrumentoDeViento();
        viento.afinar();
        viento.tocar();
        System.out.println();

        InstrumentoMusical guitarra = new Guitarra();
        guitarra.afinar();
        guitarra.tocar();
        System.out.println();

        Orquesta orquesta = new Orquesta();
        orquesta.tocar(viento);
        orquesta.tocar(guitarra);
        System.out.println();

/*
        Listas:
            - Pueden ser homogeneas u heterogeneas
            - Longitud indefenida
            - Acceso Aleatorio
            - NO PERMITE borrar un elemento mientras se recorre

        Listas más usadas:
            -> ArrayList (Sin orden)
            -> LinkedList (Lista encadenada)
            -> SynchronizedList (Para programación concurrente)

        Se crean usando la interfaz List
        List p = new ArrayList();
        p.add(...);
        p.remove(...);
        p.get(i);
        p.size();
*/

        // Lista Heterogenea

        List lista = new ArrayList();
        lista.add(1);
        lista.add("hola");
        lista.add(orquesta);
        lista.add(new Guitarra());

        //Lista Homogenea

        List<InstrumentoMusical> instrumentos = new LinkedList<>();
        instrumentos.add(new Guitarra());
        instrumentos.add(new InstrumentoDeViento());
        instrumentos.add(new Guitarra());

        //Teniendo el mismo codigo de arriba, le puedo cambiar de ArrayList a LinkedList (Otra clase que implemente List)
        //sin necesidad de modificar el código

        // Imprimir lista

        for (Object o : lista) {
            System.out.println(o);
        }
        System.out.println();
        for (InstrumentoMusical instrumento : instrumentos) {
            System.out.println(instrumento);
        }
        System.out.println();

        //Imprimir usando el metodo tocar de orquesta

        orquesta.tocar(instrumentos);


    }
}
