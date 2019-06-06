package clase9;

import clase9.Controller.LoginController;
import clase9.Exceptions.InvalidUser;
import clase9.Model.User;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Login de una pagina, para esto vamos a tener una clase Login, va a constar de 3 operaciones
        Crear usuario: recibe un usuario y password, y lo crea.
        Loguear: recibe un usuario y password, verifica que exista, si está bien retorna ok,
        sino retorna una exception
        Desloguear: Si el usuario está logueado, lo desloguea

        Leer Lenguajes de Programación

        Patrón Strategy

        Vimos hasta ahora:
            Singleton
            Observer
            Template Method
            Strategy
        */

        LoginController controller = LoginController.getInstance();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Crear Usuario:");
        System.out.print("\tIngrese nombre de usuario: ");
        String username = scanner.nextLine();
        System.out.print("\n\tIngrese contraseña: ");
        String password = scanner.nextLine();
        User user = new User(username,password);
        try {
        controller.register(user);
            System.out.println(controller.login(user));
            System.out.println(controller.logOff(user));
        } catch (InvalidUser e) {
            System.out.println("Usuario invalido");
        }

    }
}
