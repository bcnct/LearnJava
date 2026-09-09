import java.util.Scanner;

public class PakDanur07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int anak;
        double gaji_awal, danaPensiun = 0.1, tunjanganAnak, gaji_akhir;
        System.out.println("Masukkan Jumlah Gaji Pokok Anda");
        System.out.print("Rp");
        gaji_awal = input.nextDouble();
        System.out.println("Masukkan Jumlah Anak Anda ");
        anak = input.nextInt();
        tunjanganAnak = anak*100000;
        gaji_akhir = gaji_awal - (gaji_awal*danaPensiun) + tunjanganAnak;
        System.out.println("Gaji bersih yang Anda terima adalah Rp"+gaji_akhir);
    }
}