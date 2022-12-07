
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
public class odev76 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("terim sayısı: ");
        int n = input.nextInt();
        double toplam = 0;
        for (int i = 0; i <= n; i++) {
            int fakt = 1;
            for (int j = 1; j <= 2 * i + 1; j++) {
                fakt *= j;

            }
            toplam += (double) (2 * i + 2) / fakt;
        }
        System.out.println("e değeri: " + toplam);
    }

}
