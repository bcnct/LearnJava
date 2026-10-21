
import java.util.Scanner;

public class KafeDoWhile07 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int kopi, teh, roti;
        String namaPelanggan;
        int hargaKopi = 12000, hargaTeh = 7000, hargaRoti = 20000;
        int totalHarga;

        do {
            System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar): ");
            namaPelanggan = sc.nextLine();

            // Jika input adalah "batal" (huruf besar/kecil tidak masalah karena equalsIgnoreCase), 
            // maka perulangan berhenti (break)
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan.");
                break;
            }

            System.out.print("Jumlah kopi: ");
            kopi = sc.nextInt();
            System.out.print("Jumlah teh: ");
            teh = sc.nextInt();
            System.out.print("Jumlah roti: ");
            roti = sc.nextInt();

            totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
            System.out.println("Total yang harus dibayar: Rp " + totalHarga);

            // Membersihkan newline dari buffer (sesuai keterangan di gambar)
            sc.nextLine();

        } while (true);

        // Mencetak teks setelah perulangan selesai
        System.out.println("Semua transaksi selesai.");
    }
}
