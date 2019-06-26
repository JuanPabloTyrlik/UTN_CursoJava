package clase7.Broadcast;

import java.util.ArrayList;
import java.util.List;

public class Broadcast {
    private List<User> usuarios = new ArrayList<>();

    public List<User> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<User> usuarios) {
        this.usuarios = usuarios;
    }

    public void sendMessage(String message) {
        for (User usuario : usuarios) {
            usuario.receiveMessage(message);
        }
    }

    public void sendMessage(String message, String username) {
        for (User usuario : usuarios) {
            usuario.receiveMessage(message, username);
        }
    }
}
