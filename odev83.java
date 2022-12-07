
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
public class odev83 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("ab doğru parçasının uzunluğu: ");
         int ab =input.nextInt();
         double cb=2*ab/(1+Math.pow(5,0.5));
         double ac=ab-cb;
         System.out.println("ac:"+ac);
         System.out.println("cb:"+cb);
         
    }
    
}
