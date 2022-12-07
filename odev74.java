
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
public class odev74 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("bir n değeri giriniz.");
        int n = input.nextInt();
        System.out.println("bir x değeri giriniz.");
        int x = input.nextInt();
        double toplam = 0;
        for (int i = 0; i <n; i++) {
            int fakt = 1;
            for (int j = 1; j <= i; j++) {
                fakt = fakt * j;

            }
            toplam += (double) (x ^ i) / fakt;
        }
        System.out.println("e üssü x değeriniz:" + toplam);

    }

}
