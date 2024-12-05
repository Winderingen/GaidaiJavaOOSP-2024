public class HttpProtocol implements NetworkProtocol {
    @Override
    public void send(String message) {
        System.out.println("Отправка сообщения через HTTP: " + message);
    }
}
