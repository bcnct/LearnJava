import java.util.Scanner;
public class PakTono07 {

    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        double lebar, panjang, diameter, kolam, taman, akhir;
        System.out.println("Masukkan lebar tanah Anda");
        lebar = masuk.nextDouble();
        System.out.println("Masukkan panjang tanah Anda");
        panjang = masuk.nextDouble();
        System.out.println("Masukkan diameter kolam yang akan Anda buat");
        kolam = masuk.nextDouble();
        System.out.println("Masukkan panjang taman yang akan Anda buat");
        taman = masuk.nextDouble();
        System.out.print("Sisa tanah yang tidak Anda gunakan adalah "+ (lebar*panjang-((taman*taman)+(Math.PI*(kolam/2)*(kolam/2))))+" m^2");
    }
}