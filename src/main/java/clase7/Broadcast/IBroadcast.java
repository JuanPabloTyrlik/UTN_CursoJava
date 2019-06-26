package clase7.Broadcast;

public interface IBroadcast {
    void receiveMessage(String message);
    void receiveMessage(String message, String username);
}
