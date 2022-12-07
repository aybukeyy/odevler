
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
public class odev86 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("üst sınırı giriniz.");
        int n = input.nextInt();

        for (int i = 2; i <= n; i++) {
            int S = 0;
            for (int j = 1; j <= i; j++) 

                if (i % j == 0) {
                    S = S + 1;
                }
                if (S == 2) {
                    System.out.println(i);

                }

            }
        }
    }

