
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
public class odev111 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner input=new Scanner(System.in);
       int sayi1=1;
       int sayi2=1;
        System.out.println("terim sayısı: ");
        int n =input.nextInt();
        System.out.println(sayi1);
        System.out.println(sayi2);
        for (int i =3; i <= n; i++) {
            int yeni= sayi1+sayi2;
            System.out.println(yeni);
            sayi1=sayi2;
            sayi2=yeni;
            
        }
    }
    
}
