
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
public class odev71 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("bir x sayısı giriniz.");
        int x = input.nextInt();
        double toplam = 0;
        for (int i = 0; i < x; i++) {
            toplam += (double) 1 / ((2 * i + 1) * (2 * i + 2));

        }
        System.out.println("ln(2) değeriniz:" + toplam);
    }

}
