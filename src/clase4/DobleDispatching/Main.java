package clase4.DobleDispatching;

//Crear un piedra, papel o tijera usando Doble Dispatching sin usar if o switch
//REFACTORIZADOR DE CODIGO -> SONARQUBE, JENKINS

public class Main {
    public static void main(String[] args) {
        Piedra piedra=new Piedra();
        Tijera tijera=new Tijera();
        Papel papel=new Papel();
        System.out.println(piedra.vsPiedra());
        System.out.println(piedra.vsPapel());
        System.out.println(piedra.vsTijera());
        System.out.println();
        System.out.println(tijera.vsPiedra());
        System.out.println(tijera.vsPapel());
        System.out.println(tijera.vsTijera());
        System.out.println();
        System.out.println(papel.vsPiedra());
        System.out.println(papel.vsPapel());
        System.out.println(papel.vsTijera());


    }
}
