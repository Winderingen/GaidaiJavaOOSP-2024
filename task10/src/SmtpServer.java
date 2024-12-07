public class SmtpServer {
    private String host;
    private int port;

    public SmtpServer(String host, int port) {
        this.host = host;
        this.port = port;
    }

    public void connect() {
        System.out.println("Connecting to SMTP server at " + host + ":" + port);
    }

    public void disconnect() {
        System.out.println("Disconnecting from SMTP server.");
    }
}
