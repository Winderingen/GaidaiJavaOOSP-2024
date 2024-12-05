public class WiFiNetwork extends WirelessNetwork {
    public WiFiNetwork(NetworkManager networkManager) {
        super(networkManager);
    }

    @Override
    public void connect() {
        System.out.print("Connecting to Wi-Fi...");
        networkManager.connect();
    }

    @Override
    public void disconnect() {
        System.out.print("Disconnecting from Wi-Fi...");
        networkManager.disconnect();
    }
}