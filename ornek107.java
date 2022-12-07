
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
public class ornek107 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("bir sayı giriniz.");
        int n = input.nextInt();
        System.out.println("palindrom tamsayılarının toplam sayısı: "+((9*10)^((n-1)/2)));
    }
    
}
