
import java.util.Scanner;

public class tokobuku07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String jenisBuku;
        int jumlahBuku;
        double diskon;
        System.out.print("Masukkan jenis buku: ");
        jenisBuku = sc.nextLine();
        System.out.print("Masukkan jumlah buku: ");
        jumlahBuku = sc.nextInt();
        if (jenisBuku.equalsIgnoreCase("Kamus")) {
            if (jumlahBuku > 2) {
                diskon = 0.12;
            } else {
                diskon = 0.1;
            }
        } else if (jenisBuku.equalsIgnoreCase("Novel")) {
            diskon = 0.07;
            if (jumlahBuku > 3) {
                diskon += 0.02;
            } else {
                diskon += 0.01;
            }
        } else {
            if (jumlahBuku > 3) {
                diskon = 0.05;
            } else {
                diskon = 0;
            }
        }
        diskon *= 100;
        // default
        System.out.println("Karena jumlah buku yang dibeli adalah " + jumlahBuku + " maka diskon yang didapat adalah " + (int) diskon + "%");
    }
}
