//Bai 3: 1. Viet chuong trinh kiem tra so n co phai la so nguyen to hay khong
//       2. Viet chuong trinh inra n so nguyen to dau tien. Voi n nhap tu ban phim
package bai3;

import static java.lang.Math.sqrt;
import java.util.Scanner;
public class bai33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = input.nextInt();
        if(n<2){
            System.out.println("n khong phai la so nguyen to");
        }
        else if(n==2){
            System.out.println("n la so nguyen to");
        }
        else{
                int kt=0;
            for (int i=2;i<=sqrt(n);i++){
                if(n%i ==0){
                    kt= 1;
                    break;
                }
            }
                 if(kt==0)
                     System.out.println("n la so nguyen to");
                 else System.out.println("n khong phai la so nguyen to");
        }
    }   
}

