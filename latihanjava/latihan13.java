package latihanjava;

import java.util.Scanner;

public class latihan13 {
    public static void main(String[] args) {
        // Deklarasi dan inisialisasi array
        int[] tinggi = new int[]{3, 6, 3, 7, 6, 3};

        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Angka yang akan dicari? ");
        int angkaDicari = inputScanner.nextInt();

        String indeksDitemukan = "";
        boolean ditemukan = false;

        // Gunakan for-each untuk menelusuri elemen array
        int index = 0; // variabel tambahan untuk melacak indeks
        for (int t : tinggi) {
            if (t == angkaDicari) {
                if (!indeksDitemukan.isEmpty()) {
                    indeksDitemukan += ", ";
                }
                indeksDitemukan += index;
                ditemukan = true;
            }
            index++; // naikkan indeks setiap iterasi
        }

        // Tampilkan hasil pencarian
        if (ditemukan) {
            System.out.println("Angka tersebut ada di indeks: " + indeksDitemukan);
        } else {
            System.out.println("Angka " + angkaDicari + " tidak ditemukan dalam array.");
        }
    }
}
