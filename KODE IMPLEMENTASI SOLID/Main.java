import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Dependency Injection (injeksi dependensi)
        EmailService emailService = new SmtpEmailService();
        OrderProcessor orderProcessor = new OrderProcessor(emailService);
        // Scanner untuk menerima input dari pengguna
        Scanner scanner = new Scanner(System.in);
        String orderDetails;

        // Loop untuk terus memproses pesanan sampai pengguna keluar
        while (true) {
            System.out.println("Masukkan detail pesanan (ketik 'exit' untuk keluar): ");
            orderDetails = scanner.nextLine();

            // Jika pengguna mengetik "exit", keluar dari loop
            if (orderDetails.equalsIgnoreCase("exit")) {
                System.out.println("Keluar dari program.");
                break;
            }

            // Proses pesanan
            orderProcessor.processOrder(orderDetails);
            System.out.println("Pesanan telah diproses.\n");
        }
        scanner.close();
    }
}