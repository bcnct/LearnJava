import java.util.Scanner;

/**
 * MenghitungTotalBayar07
 */
public class MenghitungTotalBayar07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double harga;
        double potongan, jml_bayar, diskon = 0.15;
        harga = sc.nextDouble(); // Mengganti tipe dari variabel harga juga harus mengganti method dengan yang
                                 // sesuai
        potongan = diskon * harga;
        jml_bayar = harga - potongan;
        System.out.println("Jumlah yang harus anda bayar adalah Rp. " + jml_bayar);
    }
}