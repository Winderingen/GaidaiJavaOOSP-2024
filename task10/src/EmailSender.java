public class EmailSender {
    private SmtpServer smtpServer;

    public EmailSender(SmtpServer smtpServer) {
        this.smtpServer = smtpServer;
    }

    public void sendEmail(Email email) {
        smtpServer.connect();
        System.out.println("Sending email to: " + email.getRecipient());
        System.out.println("Subject: " + email.getSubject());
        System.out.println("Body: " + email.getBody());
        smtpServer.disconnect();
        System.out.println("Email sent successfully!");
    }
}
