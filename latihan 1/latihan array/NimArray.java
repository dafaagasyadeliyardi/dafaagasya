import java.util.Scanner;

public class NimArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan NIM: ");
        String nim = input.nextLine();

        // Ubah string menjadi array digit (int)
        int[] digit = new int[nim.length()];
        for (int i = 0; i < nim.length(); i++) {
            digit[i] = Character.getNumericValue(nim.charAt(i));
        }

        // Total
        int total = 0;
        for (int d : digit) {
            total += d;
        }

        // Maksimum
        int mak = digit[0];
        for (int d : digit) {
            if (d > mak) {
                mak = d;
            }
        }

        // Minimum
        int minim = digit[0];
        for (int d : digit) {
            if (d < minim) {
                minim = d;
            }
        }

        // Rata-rata
        double rata = (double) total / digit.length;

        // Reverse array
        int[] rev = new int[digit.length];
        for (int i = digit.length - 1, j = 0; i >= 0; i--, j++) {
            rev[j] = digit[i];
        }

        // Output
        System.out.print("Digit        : [");
        for (int i = 0; i < digit.length; i++) {
            System.out.print(digit[i]);
            if (i < digit.length - 1) System.out.print(", ");
        }
        System.out.println("]");

        System.out.println("Total        = " + total);
        System.out.println("Maksimum     = " + mak);
        System.out.println("Minimum      = " + minim);
        System.out.println("Rata-rata    = " + rata);

        System.out.print("Reverse array: [");
        for (int i = 0; i < rev.length; i++) {
            System.out.print(rev[i]);
            if (i < rev.length - 1) System.out.print(", ");
        }
        System.out.println("]");

        input.close();
    }
}