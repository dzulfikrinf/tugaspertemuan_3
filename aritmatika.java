package aritmatika;
import java.util.Scanner;

public class aritmatika {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan pertama: ");
        int bil1 = input.nextInt();

        System.out.print("Masukkan bilangan kedua: ");
        int bil2 = input.nextInt();

        System.out.print("Masukkan operator aritmatika: ");
        char operator = input.next().charAt(0);

        int hasil = 0;

        switch (operator) {
            case '+':
                hasil = bil1 + bil2;
                System.out.println("Hasil penjumlahan " + bil1 + 
                        " dan " + bil2 + " adalah: " + hasil);
                break;
            case '-':
                hasil = bil1 - bil2;
                System.out.println("Hasil pengurangan " + bil1 +
                        " dan " + bil2 + " adalah: " + hasil);
                break;
            case '*':
                hasil = bil1 * bil2;
                System.out.println("Hasil perkalian " + bil1 + 
                        " dan " + bil2 + " adalah: " + hasil);
                break;
            case '/':
                if (bil2 != 0) {
                    hasil = bil1 / bil2;
                    System.out.println("Hasil pembagian " + bil1 + 
                            " dan " + bil2 + " adalah: " + hasil);
                } else {
                    System.out.println("Tidak bisa pembagian dengan 0");
                }
                break;
            case '%':
                if (bil2 != 0) {
                    hasil = bil1 % bil2;
                    System.out.println("Hasil modulus " + bil1 + 
                            " dan " + bil2 + " adalah: " + hasil);
                } else {
                    System.out.println("Tidak bisa modulus dengan nol");
                }
                break;
            default:
                System.out.println("Operator aritmatika tidak valid");
        }
    }
}
