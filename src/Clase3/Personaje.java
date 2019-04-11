package clase3;

public abstract class Personaje {
	protected String clase;
	protected double fuerza;
	protected double defensa;
	protected double skill;
	protected double vida;
	protected String superPoder;
	protected double ataque;

	public abstract String atacar();
	
	public static void luchar(Personaje p1, Personaje p2) {
		int i=1;
		System.out.println(p1.clase+" vs "+p2.clase);
		while (p1.vida > 0 && p2.vida > 0) {
			p2.vida -= p1.ataque;
			p1.vida -= p2.ataque;
			System.out.println("\tRound "+(i++)+":");
			System.out.println("\t\tVida del "+p1.clase+" = "+p1.vida);
			System.out.println("\t\tVida del "+p2.clase+" = "+p2.vida);
		}
        if (p1.vida > p2.vida) {
            System.out.println(p1.clase + " GANA");
        } else {
            if (p1.vida == p2.vida) {
                System.out.println("Empate");
            } else {
                System.out.println(p2.clase + " GANA");
            }
        }
	}

	public Personaje(String clase, double fuerza, double defensa, double skill,
			double vida, String superPoder) {
		super();
		this.clase = clase;
		this.fuerza = fuerza;
		this.defensa = defensa;
		this.skill = skill;
		this.vida = vida;
		this.superPoder = superPoder;
	}
	
	
}
