import java.util.Scanner;

public class TugasParkir07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lamaParkir, tarif;
        System.out.print("Berapa lama parkir? ");
        lamaParkir = sc.nextInt();
        if (lamaParkir <= 2) {
            tarif = 2000;
        } else {
            tarif = 2000 + (lamaParkir - 2) * 1000;
        }
        System.out.println("Tarif: Rp"+tarif);
    }
}