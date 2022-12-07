
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
public class odev105 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("bir sayı giriniz.");
        int n = input.nextInt();
        int toplam = 0;
        int S = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                toplam = toplam + i;
                S = S + 1;

            }

        }

        if (toplam % S == 0) {
            System.out.println("Sayınız aritmetiktir.");

        } else {
            System.out.println("sayınız aritmetik değildir.");
        }
    }

}
