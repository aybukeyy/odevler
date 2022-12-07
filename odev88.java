
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
public class odev88 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("lütfen tamsayı giriniz.");
        int a = input.nextInt();
        int b = 2;
        System.out.println("Asal çarpanlarınız: ");
        while (a > 1) {
            if (a % b == 0) {
                a = a / b;
                System.out.println(b);
            } else {
                b = b + 1;
            }
        }

    }
}
