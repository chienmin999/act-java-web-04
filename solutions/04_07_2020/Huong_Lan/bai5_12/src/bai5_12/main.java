/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai5_12;
import java.util.Scanner;
/**
 *
 * @author Student
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                Scanner input = new Scanner(System.in);
        System.out.println("Nhap n:");
        int n = input.nextInt();
        float s = 0;
        int tong=0;
        for (int i = 1; i <= n; i++) {
            tong=tong+i;
            s = s + (float)1/(tong);
        }
        System.out.println("Tong s= " + s);
    }
    
}
