
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
public class ornek95 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("bir x giriniz.");
        int x = input.nextInt();
        System.out.println("bir y sayısı giriniz.");
        int y=input.nextInt();
        for (int i = 2; i <=x; i++) {
            for (int j = 2; j <=y; j++) {
                System.out.println("leyland sayıları:"+ (i^j+j^i));
                
            }
            
        }
        
    }
    
}
