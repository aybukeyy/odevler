
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
public class odev101 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("lütfen üst sınır giriniz");
        int n = input.nextInt();
        for (int i = 1; i <=n; i++) {
           int s=0;
            for (int j = 1; j <=i; j++) {
                if (i%j==0) {
                   s++; 
                }
                
            }
            
            if (i%s==0) {
                System.out.println(i+"tau sayısıdır.");
                
            }
        }
       
    }

}
