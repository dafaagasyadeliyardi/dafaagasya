import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class switchcaseatm {

    public static String formatRupiah(long n) {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        symbols.setGroupingSeparator('.');
   
        DecimalFormat formatter = new DecimalFormat("#,###", symbols);
        return formatter.format(n);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nama, valid, nimStr;
        int pilihan;
        long saldo = 0;
        long nominal;

        System.out.print("Masukkan nama: ");
        nama = scanner.nextLine();

        System.out.print("Apakah nama sudah benar? (TRUE/FALSE): ");
        valid = scanner.nextLine();

        if (!valid.equalsIgnoreCase("TRUE")) {
            System.out.println("Nama tidak valid. Silakan ulangi.");
            System.exit(0);
        }

        System.out.print("Masukkan NIM: ");
        nimStr = scanner.nextLine();

        saldo = 2510147; 

        System.out.println("\nSelamat datang, " + nama);
        System.out.println("Saldo Anda saat ini: Rp " + formatRupiah(saldo) + "\n");

        System.out.println("======== MENU ATM ========");
        System.out.println("1. Cek Saldo");
        System.out.println("2. Tarik Tunai");
        System.out.println("3. Setor Tunai");
        System.out.println("4. Transfer");
        System.out.println("5. Keluar");
        System.out.print("Pilih menu (1-5): ");
        
        if (scanner.hasNextInt()) {
            pilihan = scanner.nextInt();
        } else {
            System.out.println("Input pilihan tidak valid.");
            scanner.close();
            return;
        }

        switch (pilihan) {
            case 1:
                System.out.println("\nSaldo Anda saat ini adalah: Rp " + formatRupiah(saldo));
                break;
            case 2:
                System.out.print("Masukkan nominal Tarik Tunai: Rp ");
                nominal = scanner.nextLong();
                if (nominal > saldo) {
                    System.out.println("Saldo tidak mencukupi.");
                } else {
                    saldo -= nominal;
                    System.out.println("Penarikan berhasil. Saldo sisa: Rp " + formatRupiah(saldo));
                }
                break;
            case 3:
                System.out.print("Masukkan nominal Setor Tunai: Rp ");
                nominal = scanner.nextLong();
                saldo += nominal;
                System.out.println("Penyetoran berhasil. Saldo saat ini: Rp " + formatRupiah(saldo));
                break;
            case 4:
                System.out.print("Masukkan nominal Transfer: Rp ");
                nominal = scanner.nextLong();
                if (nominal > saldo) {
                    System.out.println("Saldo tidak mencukupi untuk transfer.");
                } else {
                    saldo -= nominal;
                    System.out.println("Transfer Rp " + formatRupiah(nominal) + " berhasil. Saldo sisa: Rp " + formatRupiah(saldo));
                }
                break;
            case 5:
                System.out.println("Terima kasih, silakan ambil kartu Anda.");
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }
        
        scanner.close(); 
    }
}