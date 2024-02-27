package selisihwaktu;
import java.util.Scanner;

public class SelisihWaktu {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jam mulai: ");
        int jamMulai = input.nextInt();
        System.out.print("Masukkan menit mulai: ");
        int menitMulai = input.nextInt();
        System.out.print("Masukkan jam selesai: ");
        int jamSelesai = input.nextInt();
        System.out.print("Masukkan menit selesai: ");
        int menitSelesai = input.nextInt();
        
        int totalMenitMulai = jamMulai * 60 + menitMulai;
        int totalMenitSelesai = jamSelesai * 60 + menitSelesai;

        if (totalMenitSelesai < totalMenitMulai) {
            totalMenitSelesai += 12 * 60;
        }

        int selisihMenit = totalMenitSelesai - totalMenitMulai;
        int jam = selisihMenit / 60;
        int menit = selisihMenit % 60;

        System.out.println("Lama waktu: " + jam + " jam " + menit+ " menit");
    }
}
