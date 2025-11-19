package latihanjava;

public class latihan9 {
    public static void main (String[] args){
        int tinggi = 4;

        for (int i = 1; i <= tinggi; i++) {
            for(int spasi = tinggi - i; spasi> 0; spasi--){
                System.out.print("  ");
            }
            for (int angka = 1; angka <= (2 * i - 1); angka++){
                System.out.print(angka + " ");
            }
            System.out.println();
        }
    }
}
