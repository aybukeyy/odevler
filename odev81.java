
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
public class odev81 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("bir bölüm sayısı giriniz.");
        int n = input.nextInt();
        double t = 1;
        for (int i = 1; i <=n-1; i++) {
            t=1+1/(2+1/t);
                    
            
        }
        System.out.println("karekök(3):" +(1+1/t));
    }
    
}
