public class Main {
    public static void main(String[] args) {
        // Создаем адаптер для HTTP
        ProtocolAdapter httpAdapter = new ProtocolAdapter(new HttpProtocol());
        httpAdapter.sendMessage("Привет, мир!");

        // Создаем адаптер для FTP
        ProtocolAdapter ftpAdapter = new ProtocolAdapter(new FtpProtocol());
        ftpAdapter.sendMessage("Передача файла...");

        // Создаем адаптер для SMTP
        ProtocolAdapter smtpAdapter = new ProtocolAdapter(new SmtpProtocol());
        smtpAdapter.sendMessage("Отправка электронной почты...");
    }
}