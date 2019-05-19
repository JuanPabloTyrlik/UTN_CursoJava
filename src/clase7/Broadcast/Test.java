package clase7.Broadcast;

public class Test {
    public static void main(String[] args) {
        Broadcast sala = new Broadcast();

        sala.getUsuarios().add(new User("juan.pablo.tyrlik"));
        sala.getUsuarios().add(new User("nahuel.retes"));
        sala.getUsuarios().add(new User("cosme.fulanito"));

        sala.sendMessage("Mensaje Global");
        sala.sendMessage("Mensaje Privado", "nahuel.retes");

    }
}
