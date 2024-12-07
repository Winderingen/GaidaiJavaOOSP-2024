public class EmailFacade {
    private SmtpServer smtpServer;
    private EmailSender emailSender;

    public EmailFacade(String host, int port) {
        smtpServer = new SmtpServer(host, port);
        emailSender = new EmailSender(smtpServer);
    }

    public void sendEmail(String recipient, String subject, String body) {
        Email email = new Email(recipient, subject, body);
        emailSender.sendEmail(email);
    }
}
