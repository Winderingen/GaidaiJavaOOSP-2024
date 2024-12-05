public class BasicNetworkManager implements NetworkManager {
    @Override
    public void connect() {
        System.out.println("Connected!");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnected!");
    }
}