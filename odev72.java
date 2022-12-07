/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
import java.util.Scanner;
import java.util.Random;

public class odev72 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random r = new Random();
        int randomsayi = r.nextInt(100);
        int tahmin;
        int deneme = 0;
        while (true) {
            System.out.println("1-99 arasında sayı giriniz.");
            int sayi = input.nextInt();
            deneme++;
            if (sayi < randomsayi) {
                System.out.println("daha büyük bir sayı giriniz.");
            } else if (sayi > randomsayi) {
                System.out.println("daha küçük bir sayı giriniz.");
            } else if (sayi == randomsayi) {
                System.out.println("tebrikler tahminiz doğru");
                break;
            }
        }
        System.out.println(deneme + ". denemede buldun.");
    }
}
