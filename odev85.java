
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
public class odev85 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("doğru parçasının uzunluğu:");
         int u =input.nextInt();
         double b=u/(2+Math.pow(2,5));
         double a=u-b;
         System.out.println("a:"+a);
         System.out.println("b:"+b);
    }
    
}
