package latihanjava;

import java.util.Scanner;

public class latihan10 {
    public static void main(String[] args){
    int tebakan = 8; // angka yang harus ditebak
    int inputUser;
    boolean tertebak = false; // status apakah sudah benar
    int i = 0; // penghitung percobaan

    Scanner sc = new Scanner(System.in);

    // loop while: berjalan selama i < 5 dan belum tertebak
        while ((i < 5) && (!tertebak)) {
        System.out.print("Tebakan Anda: ");
        inputUser = sc.nextInt();

        if (inputUser == tebakan) {
            tertebak = true; // ubah jadi true jika benar
        } else {
            System.out.println("Salah, coba lagi!");
        }

        i++; // tambah jumlah percobaan
    }

    // setelah loop selesai, cek apakah tertebak
        if (tertebak) {
        System.out.println("Selamat, tebakan Anda benar!");
    } else {
        System.out.println("Habis waktu! Angka yang benar adalah " + tebakan);
    }
    }

}

//kalau do while di jalan kan duluu
//baru di ulangi,setidaknya satu kali bahkan jika kondisi tidak terpenuhi.
//kalau while mengecek kondisi dulu sebelum di jalankan

//aku lebih memilih while do karna dalam game di atas kondisinya sudah di tentukan
//angka dan nyawanya jadi lebih baik pake while kalau belum di kondisikan lebih
// baik pake do while karna tebakannya belum di tentukan
