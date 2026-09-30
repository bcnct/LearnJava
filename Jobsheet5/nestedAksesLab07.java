
import java.util.Scanner;

public class nestedAksesLab07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean mahasiswaAktif, sedangDisanksi, punyaIzinDosen, asistenLab;
        mahasiswaAktif = sc.nextBoolean();
        sedangDisanksi = sc.nextBoolean();
        punyaIzinDosen = sc.nextBoolean();
        asistenLab = sc.nextBoolean();
        if (mahasiswaAktif && !sedangDisanksi) {
            if (punyaIzinDosen || asistenLab) {
                System.out.println("Akses laboratorium diberikan");
            } else {
                System.out.println("Akses ditolak: membutuhkan izin dosen atau status asisten lab");
            }
        } else {
            System.out.println("Akses ditolak: status mahasiswa tidak memenuhi syarat");
        }
    }
}
