/*Bài 7
Viết chương trình in ra tất cả dãy fibonaci < n, với n nhập vào từ bàn phím.
Gợi ý
f(0) = f(1) = 1
f(n) = f(n – 1) + f(n – 2)
 */
package bai3;
import java.util.Scanner;
public class bai37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so nguyen duong n: ");
        int n = input.nextInt();
        int[] f = new int[n];
        f[0]=1;
        System.out.println("f(0) = "+f[0]);
        f[1]=1;
        System.out.println("f(1) = "+f[1]);
        int i;
        for (i=2;i<=n;i++){
            f[i]=f[i-1]+f[i-2];
            System.out.printf("\nf(%d) = "+f[i],i);
        }
    }
}
