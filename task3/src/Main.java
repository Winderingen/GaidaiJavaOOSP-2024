public class Main {
    public static void main(String[] args) {
        NetworkManager basicNetworkManager = new BasicNetworkManager();

        WirelessNetwork wifi = new WiFiNetwork(basicNetworkManager);
        wifi.connect();
        wifi.disconnect();

        WirelessNetwork bluetooth = new BluetoothNetwork(basicNetworkManager);
        bluetooth.connect();
        bluetooth.disconnect();

        WirelessNetwork zigbee = new ZigbeeNetwork(basicNetworkManager);
        zigbee.connect();
        zigbee.disconnect();
    }
}