
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
public class odev102 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("lütfen adet sayısı giriniz");
        int n = input.nextInt();
        for (int i = 1; i <=n; i++) {
            
            System.out.println(i*(i+1)+"heterometrik sayılar");
            
        }

    }
    
}
