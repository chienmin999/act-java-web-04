/*Bài 8
Lập chương trình tính sin(x) với độ chính xác 0.0001 theo công thức:
sin(x) = x – x^3/3! + x^5/5! – …+(-1)^n.x^(2n+1)/(2n+1)!
x nhập vào từ bàn phím.
Độ chính xác 10^-4 nên x^(2n+1)/(2n+1)! <= 10^-4 suy ra n>=x+4
 */
package bai3;
import static java.lang.Math.pow;
import java.util.Scanner;
public class bai38 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap x: ");
        float x = input.nextInt();
        int n = (int) (x+4);
        float sinx1=0;
        float sinx2=0;
        float sinx=0;        
        int p = 1;
        for(int i=3;i<=n;i=i+2){
            p*= i;
            if(i%4==1){
                sinx1+= pow(1,i)*(pow(x,2*i+1)/p);
            }
            if(i%4==3){
                sinx2+= pow(-1,i)*(pow(x,2*i+1)/p);
            }
            sinx=x-sinx1+sinx2;
        }
        System.out.printf("Gia tri sin(%f)= "+sinx,x);
    }
}
