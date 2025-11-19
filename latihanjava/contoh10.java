package latihanjava;

import java.util.Scanner;

public class contoh10 {
    public static void main(String[] args){
        int tebakan = 8;
        int inputuser;
        boolean tertebak = false;
        Scanner sc = new Scanner(System.in);
        //hanya boleh menembak sampai 5 kali
        for (int i = 0; i<5; i++){
            System.out.println("tebakkan anda?");
            inputuser = sc.nextInt();
            if (tebakan == inputuser){
                tertebak = true;
                break;
            }
        }
        if (tertebak){
            System.out.println("tertebak");
        }else{
            System.out.println("habis waktu");
        }
    }
}
