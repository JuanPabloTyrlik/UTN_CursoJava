package clase9.Controller;

import clase9.Exceptions.InvalidUser;
import clase9.Model.User;

import java.util.HashSet;
import java.util.Set;

public class LoginController {
    private static LoginController controller;
    private Set<User> users = new HashSet<>(), logged = new HashSet<>();

    private LoginController() {
        super();
    }

    public synchronized static LoginController getInstance() {
        if (controller==null)
            controller = new LoginController();
        return controller;
    }

    public void register(User u) throws InvalidUser {
        if (!users.add(u))
            throw new InvalidUser();
    }

    public String login(User u) throws InvalidUser{
        if (!logged.add(u))
            throw new InvalidUser();
        else
            return "Bienvenido "+u.getName();
    }

    public String logOff(User u)throws InvalidUser {
        if (!logged.remove(u))
            throw new InvalidUser();
        else
            return "Hasta luego "+u.getName();
    }
}
