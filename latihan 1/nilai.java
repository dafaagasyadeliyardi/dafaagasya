import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan nilal tugas: ");
    double tugas = sc.nextDouble();
    System.out.print("Masukkan nilai UTS: ");

    double uts= sc.nextDouble();
    System.out.print("Masukkan nilai UAS: ")
    double uas = sc.nextDouble();

    double nilaiAkhir = (0.3* tugas) + (0.3* uts) + (0.4* uas);

    System.out.println("Nilai Akhir = " + nilaiAkhir);
    if (nilaiAkhir >= 60)
    System.out.println("Status: LULUS");
    else
    System.out.println("Status: TIDAK LULUS");
    {