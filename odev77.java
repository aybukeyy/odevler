
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
public class odev77 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("terim sayısı: ");
        int n = input.nextInt();
        double toplam = 0;
        for (int i = 0; i <= n; i++) {
            toplam += (double) (((-1)^i) / (2 * i + 1) * (3 ^ i));
        }
        toplam=toplam*(double)(12^(1/2));
        System.out.println("pi değeriniz: "+toplam);
    }

}
