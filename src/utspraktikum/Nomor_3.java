/*Gunakan metode reverse untuk mengimplementasikan isPalindrome. Suatu
bilangan disebut palindrom jika pembalikannya sama dengan bilangan itu sendiri.
Tulis program pengujian yang meminta pengguna untuk memasukkan bilangan
bulat dan melaporkan apakah bilangan bulat tersebut adalah palindrom.*/

package utspraktikum;

import java.util.Scanner;

public class Nomor_3 {
    // Return the reversal of an integer, i.e., reverse(456) returns 654
    public static int reverse(int number) {
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return reversed;
    }

    // Return true if number is a palindrome
    public static boolean isPalindrome(int number) {
        return number == reverse(number);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Masukkan bilangan bulat: ");
        int number = in.nextInt();
        
        if (isPalindrome(number)) {
            System.out.println(number + " adalah palindrom");
        } else {
            System.out.println(number + " bukan palindrom");
        }
    }
}
