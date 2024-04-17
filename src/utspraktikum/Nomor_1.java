/*
 * Tulis sebuah program yang meminta pengguna untuk memasukkan bilangan bulat tiga
digit dan menentukan apakah itu bilangan palindrom. Suatu bilangan disebut
palindrom jika bacaannya sama dari kanan ke kiri dan dari kiri ke kanan.
 */
package utspraktikum;

import java.util.Scanner;

public class Nomor_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan tiga digit integer: ");
        int number = scanner.nextInt();
        
        int digit1 = number / 100;
        int digit3 = number % 10;
        
        if (digit1 == digit3) {
            System.out.println(number + " adalah palindrom");
        } else {
            System.out.println(number + " bukan palindrom");
        }
    }
    
}
