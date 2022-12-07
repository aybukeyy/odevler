
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
public class odev99 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("bir a giriniz.");
        int a = input.nextInt();
        System.out.println("bir b sayısı giriniz.");
        int b = input.nextInt();

        int mod1 = a % 10;
        int mod2 = b % 10;
        int mod3 = (a / 10);
        int mod4 = b / 10;
        if (mod1 + mod2 == 10 && mod3 == mod4) {
            System.out.println("bağdaş sayılardır");
        }
        else{
            System.out.println("bağdaşık değildir.");
        }
    }

}
