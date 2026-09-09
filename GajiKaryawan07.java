import java.util.Scanner;

/**
 * GajiKaryawan07
 */
public class GajiKaryawan07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int gajiPokok;
        double bonus, totGaji, tunjTransp = 600000, tunjMkn = 400000;
        gajiPokok = sc.nextInt();
        bonus = 0.05 * gajiPokok;
        totGaji = gajiPokok + tunjTransp + tunjMkn + bonus - 0.1 * gajiPokok; // Hasil penghitungan tidak terganggu
                                                                              // sesuai dengan aturan PEMDAS
        System.out.println("Bonus Bulanan anda adalah Rp. " + bonus);
        System.out.println("Gaji yang diterima adalah Rp. " + (int) totGaji); // Melakukan narrowing casting dari
                                                                              // variabel bertipe double menjadi integer
    }
}