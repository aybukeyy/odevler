
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
public class odev104 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int i = 1; i <=50; i++) {
            for (int j =i; j <=50; j++) {
                for (int k =j; k <=50; k++) {
                    if ((i*i+j*j+k*k)==(3*i*j*k)) {
                        System.out.println("markov sayılar:");
                        System.out.println(i);
                        System.out.println(j);
                        System.out.println(k);
                        
                    }
                    
                }
            
                
            }
            
        }
        }

    }


