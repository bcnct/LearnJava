
import java.util.Scanner;

public class tugas2SeleksiAsisten07 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== INPUT DATA CALON ASISTEN PRAKTIKUM ===");

        // Input Semua Data Sekaligus
        System.out.print("Status mahasiswa aktif? (true/false): ");
        boolean isAktif = input.nextBoolean();

        System.out.print("Sedang dapat sanksi akademik? (true/false): ");
        boolean kenaSanksi = input.nextBoolean();

        System.out.print("Nilai Dasar Pemrograman (0-100): ");
        double nilaiDaspro = input.nextDouble();

        System.out.print("Punya sertifikat kompetensi? (true/false): ");
        boolean punyaSertifikat = input.nextBoolean();

        System.out.print("Nilai wawancara (0-100): ");
        double nilaiWawancara = input.nextDouble();

        // --- Proses Seleksi Berurutan ---
        System.out.println("\n=== HASIL SELEKSI ===");

        // Tahap 1: Status Akademik
        if (!isAktif) {
            System.out.println("GAGAL Tahap 1: Status mahasiswa tidak aktif.");
        } else if (kenaSanksi) {
            System.out.println("GAGAL Tahap 1: Mahasiswa sedang mendapatkan sanksi akademik.");
        } // Tahap 2: Kualifikasi Pemrograman
        else if (nilaiDaspro < 80 && !punyaSertifikat) {
            System.out.println("GAGAL Tahap 2: Nilai Dasar Pemrograman kurang dari 80 dan tidak memiliki sertifikat.");
        } // Tahap 3: Wawancara
        else if (nilaiWawancara < 75) {
            System.out.println("GAGAL Tahap 3: Nilai wawancara kurang dari 75 (Nilai Anda: " + nilaiWawancara + ").");
        } // Lolos Semua Tahap
        else {
            System.out.println("SELAMAT! Anda Lolos dan Diterima sebagai Asisten Praktikum.");
        }
    }
}
