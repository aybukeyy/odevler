
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
public class odev84 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("altın üçgenin kısa kenarı:");
        int a = input.nextInt();
        double b = a * (1 + Math.pow(5, 1 / 2) / 2);
        System.out.println("kısa kenar:" + a);
        System.out.println("uzun kenar:" + b);
        System.out.println("uzun kenar:" + b);
    }

}
