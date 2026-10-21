
import java.util.Scanner;

public class Tugas1Bioskop07 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hargaTiket = 50000, jumlahTiket, tiketTerjual = 0, keuntungan = 0;
        double diskonTiket, hargaAkhir;
        while (true) {
            System.out.print("Masukkan jumlah tiket: ");
            jumlahTiket = input.nextInt();

            if (jumlahTiket == 0) {
                break;
            } else if (jumlahTiket >= 0 && jumlahTiket <= 4) {
                diskonTiket = 0.0;
            } else if (jumlahTiket > 4) {
                diskonTiket = 0.1;
            } else if (jumlahTiket > 10) {
                diskonTiket = 0.15;
            } else {
                System.out.println("Jumlah tiket tidak valid! Tolong masukkan ulang");
                continue;
            }
            hargaAkhir = jumlahTiket * (hargaTiket - (hargaTiket * diskonTiket));
            System.out.println("Harga yang harus dibayar adalah sebesar Rp" + (int) hargaAkhir);
            keuntungan += hargaAkhir;
            tiketTerjual += jumlahTiket;
        }

        System.out.println("Total tiket yang terjual: " + tiketTerjual);
        System.out.println("Total harga penjualan tiket: Rp" + keuntungan);

    }

}
