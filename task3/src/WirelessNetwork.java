public abstract class WirelessNetwork {
    protected NetworkManager networkManager;

    protected WirelessNetwork(NetworkManager networkManager) {
        this.networkManager = networkManager;
    }

    public abstract void connect();
    public abstract void disconnect();
}