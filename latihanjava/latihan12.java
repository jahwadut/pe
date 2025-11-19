package latihanjava;

import java.util.Scanner;

public class latihan12 {
    public static void main (String[] args) {
        // Deklarasi dan inisialisasi array
        int[] tinggi = new int[]{3, 6, 3, 7, 6, 3};

        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Angka yang akan dicari? ");
        int angkaDicari = inputScanner.nextInt();

        String indeksDitemukan = "";
        // Variabel untuk menandai apakah angka ditemukan
        boolean ditemukan = false;

        // Loop untuk melakukan pencarian linear
         for (int i = 0; i < tinggi.length; i++) {
            if (tinggi[i] == angkaDicari) {
                // Jika angka ditemukan, tambahkan indeks
                if (!indeksDitemukan.isEmpty()) {
                    indeksDitemukan += ", ";
                }
                indeksDitemukan += i;
                ditemukan = true;
            }
        }

        // 3. Tampilkan hasil pencarian
        if (ditemukan) {
            System.out.println("Angka tersebut ada di indeks: " + indeksDitemukan);
        } else {
            System.out.println("Angka " + angkaDicari + " tidak ditemukan dalam array.");
        }
    }

}
