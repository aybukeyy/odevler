
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
public class odev75 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
        System.out.println("bir x sayısı giriniz. ");
        double x=input.nextDouble();
        System.out.println("bir n sayısı giriniz.");
        double n =input.nextDouble();
        double sonuc;
        sonuc=Math.pow((1+x/n),n);
        System.out.println(sonuc);
                
    }
    
}
