
import java.util.Scanner;

public class SiakadWhile07 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Inisialisasi variabel bernama nilai, jml, dan i yang masing-masing berjenis integer dengan i bernilai 0
        int nilai, jml, i = 0;

        System.out.print("Masukkan jumlah mahasiswa: "); // Perlu ditambah untuk mencegah infinite loop
        jml = sc.nextInt();

        while (i < jml) { // Perlu ditambah untuk mencegah infinite loop
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai = sc.nextInt();

            // Kondisi jika nilai tidak valid (kurang dari 0 atau lebih dari 100)
            if (nilai < 0 || nilai > 100) {
                System.out.println("Nilai tidak valid. Masukkan lagi nilai yang valid!");
                continue; // Akan kembali ke awal perulangan tanpa menjalankan baris di bawahnya
            }

            // Kondisi penentuan nilai huruf
            if (nilai > 80 && nilai <= 100) {
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah A");
                System.out.println("Bagus, pertahankan nilainya!");
            } else if (nilai > 73 && nilai <= 80) {
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah B+");
            } else if (nilai > 65 && nilai <= 73) {
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah B");
            } else if (nilai > 60 && nilai <= 65) {
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah C+");
            } else if (nilai > 50 && nilai <= 60) {
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah C");
            } else if (nilai > 39 && nilai <= 50) {
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah D");
            } else {
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah E");
            }

            i++; // Menambah nilai i agar perulangan bisa berhenti
        }
    }
}
