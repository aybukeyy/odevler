
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
public class odev69 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("bir x sayısı giriniz.");
        int x = input.nextInt();
        double toplam=0;
        for (int i =0 ; i <=x; i++) {
            int fakt=1;
            for (int j = 1; j <= 2*i; j++) {
                fakt=fakt*j;
                
            }
            toplam=toplam+(double)((-1)^i)*(x^(2*i))/fakt;
            
        }
        System.out.println("cos değeriniz:"+toplam);
    }
    
}
