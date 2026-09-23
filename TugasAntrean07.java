import java.util.Scanner;

public class TugasAntrean07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Pilih Loket: ");
        int layanan = sc.nextInt();
        switch (layanan) {
            case 1:
                System.out.println("Loket A - Legalisir Ijazah");
                break;
            case 2:
                System.out.println("Loket B - Surat Keterangan Aktif Kuliah");
                break;
            case 3:
                System.out.println("Loket C - Pembayaran UKT ");
                break;
            case 4:
                System.out.println("Loket D - Pengajuan Cuti Akademik");
                break;
            default:
                System.out.println("Loket tidak tersedia");
        }
    }
}