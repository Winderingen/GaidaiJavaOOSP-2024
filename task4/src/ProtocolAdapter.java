public class ProtocolAdapter {
    private NetworkProtocol protocol;

    public ProtocolAdapter(NetworkProtocol protocol) {
        this.protocol = protocol;
    }

    public void sendMessage(String message) {
        protocol.send(message);
    }
}
