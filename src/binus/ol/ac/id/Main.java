package binus.ol.ac.id;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // variable declaration
        String phoneNum;
        Scanner input = new Scanner(System.in);

        // asking for user input
        System.out.print("Masukkan Nomor Handphone Anda: ");
        phoneNum = input.next();

        // convert user input to array and count the numbers
        String[] nums = phoneNum.split("");
        int total = 0;
        for (String num: nums) {
            total += Integer.parseInt(num);
        }

        // print result to user
        System.out.println("Jumlah total nomor handphone Anda adalah: ");
        System.out.print(String.join("+", nums) + " = ");
        System.out.println(total);
    }
}
