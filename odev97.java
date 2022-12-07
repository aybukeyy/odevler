
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author asus
 */
public class odev97 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1. sayıyı giriniz.");
        int a = input.nextInt();
        System.out.println("2. sayıyı giriniz.");
        int b = input.nextInt();
        int toplamA = 0;
        int toplamB = 0;
        for (int i = 1; i < a; i++) {
            if (a % i == 0) {
                toplamA = toplamA + i;

            }
        }
        for (int j = 1; j < b; j++) {
            if (b % j == 0) {
                toplamB = toplamB + j;

            }

        }
        if (toplamB == a && toplamA == b) {
            System.out.println("Dost sayıdır.");

        } else {
            System.out.println("Dost sayı değildir.");
        }
    }

}
