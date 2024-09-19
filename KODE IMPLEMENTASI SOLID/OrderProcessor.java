public class OrderProcessor {
    private EmailService emailService;
    // Constructor Injection
    public OrderProcessor(EmailService emailService) {
        this.emailService = emailService;
    }
    // Metode untuk memproses pesanan
    public void processOrder(String orderDetails) {
        System.out.println("Memproses pesanan: " + orderDetails);
        // Logika pemrosesan pesanan
        // Mengirim email notifikasi
        emailService.sendEmail("Kasir@Gmail.com", "Pesanan Diterima", "Detail pesanan: " + orderDetails);
    }
}
