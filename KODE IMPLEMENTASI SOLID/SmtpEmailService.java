public class SmtpEmailService implements EmailService {
    @Override
    public void sendEmail(String to, String subject, String body) {
        System.out.println("Mengirim email ke: " + to);
        System.out.println("Subjek: " + subject);
        System.out.println("Isi: " + body);
        // Simulasi pengiriman email via SMTP
    }
}
