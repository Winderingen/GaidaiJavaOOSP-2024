public class ZigbeeNetwork extends WirelessNetwork {
    public ZigbeeNetwork(NetworkManager networkManager) {
        super(networkManager);
    }

    @Override
    public void connect() {
        System.out.print("Connecting to Zigbee...");
        networkManager.connect();
    }

    @Override
    public void disconnect() {
        System.out.print("Disconnecting from Zigbee...");
        networkManager.disconnect();
    }
}