package kelipatan3;
import java.util.Scanner;

public class kelipatan3 {
       public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan riil: ");
        double bilangan = input.nextDouble();
        
        String formatbil = String.format("%.2f", bilangan);
        
        System.out.println("Angka : " + formatbil);
        
        String[] parts = formatbil.split("\\.");
        
        int angkaDepanKoma = Integer.parseInt(parts[0]);
        int angkaBelakangKoma = Integer.parseInt(parts[1]);
        
        if(angkaDepanKoma != 0 && angkaBelakangKoma != 0){
            if (angkaDepanKoma % 3 == 0 && angkaBelakangKoma % 3 == 0) {
                System.out.println("Angka di depan dan di belakang koma "
                        + "adalah kelipatan 3.");
            }
            else if (angkaDepanKoma % 3 == 0) {
                System.out.println("Angka di depan koma adalah kelipatan 3 "
                        + "dan angka di belakang koma bukan kelipatan 3.");
            }
            else if (angkaBelakangKoma % 3 == 0) {
                System.out.println("Angka di belakang koma adalah kelipatan 3 "
                        + "dan angka di depan koma bukan kelipatan 3.");
            }
            else {
                System.out.println("Angka di depan dan di belakang"
                        + " koma bukan kelipatan 3.");
            }
        }
        else if (angkaDepanKoma != 0 && angkaBelakangKoma == 0 
                && angkaDepanKoma % 3 == 0) {
            System.out.println("Angka di depan koma adalah kelipatan 3"
             + " dan angka di belakang koma adalah 0, bukan kelipatan 3.");
        } 
        else if(angkaBelakangKoma != 0 && angkaDepanKoma == 0 
                && angkaBelakangKoma % 3 == 0){
            System.out.println("Angka di belakang koma adalah kelipatan 3"
             + " dan angka di depan koma adalah 0, bukan kelipatan 3.");
        }
        else {
            System.out.println("Angka di depan dan di belakang koma "
                    + "bukan kelipatan 3.");
        }

    }
}
