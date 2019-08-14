package clase3;

abstract class Personaje {
    String clase;
    double fuerza;
    double defensa;
    double skill;
    double vida;
    private String superPoder;
    double ataque;

    public abstract String atacar();

    static void luchar(Personaje p1, Personaje p2) {
        int i = 1;
        System.out.println(p1.clase + " vs " + p2.clase);
        while (p1.vida > 0 && p2.vida > 0) {
            p2.vida -= p1.ataque - p2.defensa * 0.2;
            p1.vida -= p2.ataque - p1.defensa * 0.2;
            System.out.println("\tRound " + (i++) + ":");
            if (p1.vida <= 0) {
                System.out.printf("\t\t¡%s MUERE!", p1.clase);
            } else {
                System.out.printf("\t\tVida del %s = %.0f", p1.clase, p1.vida);
            }
            if (p2.vida <= 0) {
                System.out.printf("\t\t¡%s MUERE!\n", p2.clase);
            } else {
                System.out.printf("\t\tVida del %s = %.0f\n", p2.clase, p2.vida);
            }
        }
        if (p1.vida == p2.vida || (p1.vida <= 0 && p2.vida <= 0)) {
            System.out.println("¡EMPATE!");
        } else {
            if (p1.vida > p2.vida) {
                System.out.printf("¡%s GANA!", p1.clase);
            } else {
                System.out.printf("¡%s GANA!", p2.clase);
            }
        }
    }

    Personaje(String clase, double fuerza, double defensa, double skill, double vida, String superPoder) {
        super();
        this.clase = clase;
        this.fuerza = fuerza;
        this.defensa = defensa;
        this.skill = skill;
        this.vida = vida;
        this.superPoder = superPoder;
    }


}
