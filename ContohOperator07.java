public class ContohOperator07 {

    public static void main(String[] args) {
        int x = 10; // Mendeklarasikan variabel bernama x dengan tipe data integer dan nilai 10
        System.out.println("x++ = " + x++); // Menaikkan 1 nilai x setelah operasi dilakukan
        System.out.println("Setelah evaluasi, x = " + x); // Mencetak string "Setelah evaluasi, x = " dan nilai dari
                                                          // variabel x
        x = 10; // Mengubah nilai x menjadi 10
        System.out.println("++x = " + ++x); // Menaikkan 1 nilai x sebelum operasi dilakukan
        System.out.println("Setelah evaluasi, x = " + x); // Mencetak string "Setelah evaluasi, x = " dan nilai dari
                                                          // variabel x
        int y = 12; // Mendeklarasikan variabel y dengan nilai 12
        System.out.println(x > y || y == x && y <= x);
        /*
         * x adalah 11
         * y adalah 12
         * 11 > 12 || 12 == 11 && 12 <=11
         * 11 > 12 || 12 == 11 && false
         * 11 > 12 || false
         * Maka, kedua sisi adalah false || false sehingga hasil akhirnya false
         */
        int z = x ^ y;
        /*
         * Melakukan operasi bitwise XOR antara x dan y, setiap bit bernilai 1 jika
         * kedua bit berbeda
         * 11 = 1011
         * 12 = 1100
         * 1011 ← 11
         * 1100 ← 12
         * ----
         * 0111 ← 7
         * 
         * 0×8 + 1×4 + 1×2 + 1×1 = 0 + 4 + 2 + 1
         * = 7
         * Maka, nilai z adalah 7
         */
        System.out.println("Hasil x ^ y  adalah " + z); // Mencetak string "Hasil x ^ y adalah " dan nilai dari variabel
                                                        // z
        z %= 2; // Sama dengan z = z % 2, yaitu menyimpan sisa pembagian z dengan 2 (modulus)
        System.out.println("Hasil akhir " + z); // Mencetak string "Hasil akhir " dan nilai dari variabel z
    }
}
