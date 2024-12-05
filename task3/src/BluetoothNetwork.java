public class BluetoothNetwork extends WirelessNetwork {
    public BluetoothNetwork(NetworkManager networkManager) {
        super(networkManager);
    }

    @Override
    public void connect() {
        System.out.print("Connecting to Bluetooth...");
        networkManager.connect();
    }

    @Override
    public void disconnect() {
        System.out.print("Disconnecting from Bluetooth...");
        networkManager.disconnect();
    }
}