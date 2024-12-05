public class SmtpProtocol implements NetworkProtocol {
    @Override
    public void send(String message) {
        System.out.println("Отправка сообщения через SMTP: " + message);
    }
}
