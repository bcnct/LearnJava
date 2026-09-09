import java.util.Scanner; //Mengimpor class Scanner dari package java.util

public class MenghitungLuasPersegiPanjang07 { // Mendeklarasikan class publik bernama MenghitungLuasPersegiPanjang07

    public static void main(String[] args) { // Mendeklarasikan method main sebagai titik awal eksekusi program
        Scanner sc = new Scanner(System.in); // Mendeklarasikan variabel inp bertipe Scanner dan membuat objek Scanner
                                              // untuk membaca input dari System.in (keyboard)
        int panjang, lebar, luas; // Mendeklarasikan variabel panjang, lebar, dan luas dengan tipe data int
        panjang = sc.nextInt(); // Membaca sebuah bilangan bulat dari input dan menyimpannya ke variabel panjang
        lebar = sc.nextInt(); // Membaca sebuah bilangan bulat dari input dan menyimpannya ke variabel lebar
        luas = panjang * lebar; // Menghitung luas dengan mengalikan panjang dan lebar, kemudian menyimpan
                                // hasilnya ke variabel luas
        System.out.println("Luas persegi adalah " + luas); // Mencetak teks "Luas persegi panjang adalah " beserta nilai
                                                           // luas
    }
}