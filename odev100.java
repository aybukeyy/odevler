
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
public class odev100 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("bir sayı giriniz.");
        int s = input.nextInt();
        int t=0;
        for (int i = 1; i <=s; i++) {
            if (t<2*s) {
                System.out.println("eksik sayıdır ve eksiklik miktarı="+(2*s-t));
                
            }
            else{
                System.out.println("eksik sayı değildir.");
            }
            if (s%i==0) {
                t=t+i;
                
            }
           
        }
    }
    
}
