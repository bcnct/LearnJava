/**
 * ContohTipeData07
 */
public class ContohTipeData07 {

    public static void main(String[] args) {
        char golonganDarah = 'A';
        byte jarak = (byte) 130;
        short jumlahPendudukDalamSatuDusun = 1025;
        float suhu = 60.50F;
        double berat = 0.5467812345;
        long saldo = 150000000;
        int angkaDesimal = 0x10;

        System.out.println("Golongan darah\t\t\t\t\t\t: " + (byte) golonganDarah);
        System.out.println("Jarak\t\t\t\t\t\t\t: " + jarak);
        System.out.println("Jumlah penduduk dalam satu dusun\t: " + jumlahPendudukDalamSatuDusun);
        System.out.println("Suhu: " + suhu);
        System.out.println("Berat: " + (float) berat);
        System.out.println("Saldo: " + saldo);
        System.out.println("Angka desimal: " + angkaDesimal);
    }
}