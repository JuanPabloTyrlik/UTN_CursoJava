package clase5;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Auto> autos = new ArrayList<>();
        Auto auto1 = new Auto("ABC123", "Ford", "Fiesta", "Negro");
        Auto auto2 = new Auto("ABC222", "Ford", "Fiesta", "Gris");
        Auto auto3 = new Auto("ABC333", "Ford", "Fiesta", "Negro");
        Auto auto4 = new Auto("ABC444", "Ford", "Fiesta", "Negro");
        Auto auto5 = new Auto("ABC123", "Ford", "Fiesta", "Blanco");
        autos.add(auto1);
        autos.add(auto2);
        autos.add(auto3);
        autos.add(auto4);
        autos.add(auto5);
        Set<Auto> diferentes = new HashSet<>();
        List<Auto> iguales = new ArrayList<>();
        Map<String, List<Auto>> autoMap = new HashMap<>();
        for (Auto auto : autos) {
            if (!diferentes.add(auto)) {
                for (Auto auto6 : diferentes) {
                    if (auto6.getPatente().equals(auto.getPatente())) {
                        iguales.add(auto6);
                    }
                }
                iguales.add(auto);
                autoMap.put("Iguales", iguales);
            }
        }
        autoMap.put("Diferentes", List.copyOf(diferentes));

        System.out.println(autoMap);
        System.out.println("Diferentes:");
        for (Auto auto : diferentes) {
            System.out.println("\t"+auto.getPatente());
        }
        System.out.println("\nIguales:");
        for (Auto auto : iguales) {
            System.out.println("\t"+auto.getPatente());
        }




    }
}
