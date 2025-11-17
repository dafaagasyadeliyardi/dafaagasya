import java.util.Scanner
public class main2 {
    public static void main(String[] args) {
        final double PI = 3.14159;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Jari-jari : ");
        double R = input.nextDouble();
        double luas = PI * R * R;
        System.out.println("Luas Lingkaran : " + luas);
    }
}