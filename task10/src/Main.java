public class Main {
    public static void main(String[] args) {
        EmailFacade emailFacade = new EmailFacade("smtp.example.com", 587);

        emailFacade.sendEmail("recipient@example.com", "Hello World", "This is a test email.");
    }
}