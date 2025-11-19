package latihanjava;

import java.util.Scanner;

public class latihan14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 1. Minta user memasukkan ukuran matriks
        System.out.print("Masukkan jumlah baris matriks: ");
        int baris = input.nextInt();
        System.out.print("Masukkan jumlah kolom matriks: ");
        int kolom = input.nextInt();

        // 2. Deklarasi dua matriks dan hasilnya
        int[][] matriks1 = new int[baris][kolom];
        int[][] matriks2 = new int[baris][kolom];
        int[][] hasil = new int[baris][kolom];

        // 3. Input elemen matriks pertama
        System.out.println("\nMasukkan elemen-elemen Matriks 1:");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("Matriks1[" + i + "][" + j + "] = ");
                matriks1[i][j] = input.nextInt();
            }
        }

        // 4. Input elemen matriks kedua
        System.out.println("\nMasukkan elemen-elemen Matriks 2:");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("Matriks2[" + i + "][" + j + "] = ");
                matriks2[i][j] = input.nextInt();
            }
        }

        // 5. Penjumlahan kedua matriks
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                hasil[i][j] = matriks1[i][j] + matriks2[i][j];
            }
        }

        // 6. Tampilkan hasilnya
        System.out.println("\nMatriks 1:");
        tampilkanMatriks(matriks1);

        System.out.println("\nMatriks 2:");
        tampilkanMatriks(matriks2);

        System.out.println("\nHasil Penjumlahan Matriks:");
        tampilkanMatriks(hasil);

        input.close();
    }

    // Fungsi untuk menampilkan matriks
    public static void tampilkanMatriks(int[][] matriks) {
        for (int[] baris : matriks) {
            for (int nilai : baris) {
                System.out.print(nilai + "\t");
            }
            System.out.println();
        }
    }
}

