package clase7.Broadcast;

public class User implements IBroadcast {
    private String username;
    private String password;

    public User(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println("Usuario: " + username + " Broadcast: " + message);
    }

    @Override
    public void receiveMessage(String message, String username) {
        if (username.equals(this.username)) {
            System.out.println("Usuario: " + username + " Private Message: " + message);
        }
    }
}
