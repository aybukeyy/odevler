
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
public class odev96 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("bir sayı giriniz.");
        int s = input.nextInt();
        if ((s-1)%4==0) {
            System.out.println("hilbbert sayıdır.");
            
        }
        else{
            System.out.println("hilbert sayı değildir.");
        }
    }
    
}
