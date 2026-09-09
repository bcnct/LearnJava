import java.util.Scanner;

public class Percetakan07 {

    public static void main(String[] args) {
        Scanner jumlah = new Scanner(System.in);
        int lembar, tanpaJilid, denganJilid;

        System.out.print("Mau cetak berapa lembar? ");
        lembar = jumlah.nextInt();
        tanpaJilid = lembar * 500; // Untuk harga per lembar sebesar Rp.500
        denganJilid = lembar * 500 + 5000; // Untuk harga per lembar sebesar Rp.500 dan harga jilid sebesar Rp.5000

        System.out.println("Maka, total biaya cetak untuk kertas sebanyak " + lembar + " lembar adalah Rp." + tanpaJilid);
        System.out.println("Jika dengan jilid, maka menjadi Rp." + denganJilid);
    }
}