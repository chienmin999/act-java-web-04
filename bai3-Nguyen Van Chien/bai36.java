/*Bài 6.
1. Nhập vào 2 số nguyên a, b từ bàn phím. Tìm ươc chung lớn nhất của 2 số.
2. Nhập vào 2 số nguyên a, b từ bàn phím. Tím bối chung nhỏ nhất của 2 số
 */
package bai3;
 
import java.util.Scanner;
public class bai36{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so nguyen duong a: ");
        int a = input.nextInt();
        System.out.println("Nhap so nguyen duong b: ");
        int b = input.nextInt();
        System.out.println("USCLN của " + a + " và " + b + " là: " + UCLN(a, b));
        System.out.println("BSCNN của " + a + " và " + b + " là: " + BCNN(a, b));
    }
     
    public static int UCLN(int a, int b) {
        if (b == 0) return a;
        return UCLN(b, a % b);
    }

    public static int BCNN(int a, int b) {
        return (a * b) / UCLN(a, b);
    }
}
