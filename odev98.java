
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
public class odev98 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                for (int k = 0; k <= 9; k++) {
                    int s = 100 * i + 10 * j + k;
                    if (s == (i ^ 3 + j ^ 3 + k ^ 3)) {
                        System.out.println("armostrong sayılar:" + s);
                    }

                }

            }

        }

    }

}
