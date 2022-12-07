
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
public class odev89 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayac = 0;
        int sayac2 = 0;
        int n;
        while (true) {
            System.out.println("sıfırdan büyük bir sayı giriniz.");
            n = input.nextInt();
            if (n > 0) {
                break;

            }
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                sayac++;
                break;

            }
            if ((n + 2) % i == 0) {
                sayac2++;
                break;

            }

        }
        if (sayac == 0 && sayac2 == 0 && n != 2 && n != 1 && n != 0) {
            System.out.println("sayınız chen asalıdır.");

        } else {
            System.out.println("sayınız chen asalı değildir");
        }

    }
}
