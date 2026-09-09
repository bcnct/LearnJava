import java.util.Scanner;

public class Rina07 {

    public static void main(String[] args) {
        Scanner angka = new Scanner(System.in);
        double uangMuka, hargaLaptop, bunga, sisaHarga, cicilan;
        int bulan;

        System.out.print("Harga Laptop: Rp.");
        hargaLaptop = angka.nextDouble();
        System.out.print("Uang Muka: Rp.");
        uangMuka = angka.nextDouble();
        System.out.print("Jumlah bulan: ");
        bulan = angka.nextInt();

        sisaHarga = hargaLaptop - uangMuka;
        bunga = 0.02 * sisaHarga;
        cicilan = sisaHarga / bulan + bunga;
        System.out.println("Cicilan yang harus dibayar oleh anda setiap bulan adalah Rp." + (int) cicilan);
    }
}