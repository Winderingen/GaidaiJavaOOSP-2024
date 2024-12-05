public class FtpProtocol implements NetworkProtocol {
    @Override
    public void send(String message) {
        System.out.println("Отправка сообщения через FTP: " + message);
    }
}
