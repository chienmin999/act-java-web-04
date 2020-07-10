//Bai 3: 1. Viet chuong trinh kiem tra so n co phai la so nguyen to hay khong
//       2. Viet chuong trinh in ra n so nguyen to dau tien. Voi n nhap tu ban phim
package bai3;
 
import static java.lang.Math.sqrt;
import java.util.Scanner;
public class bai332 {
    
    public static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    } 
    private static final Scanner scanner = new Scanner(System.in);   
    public static void main(String[] args) {
        System.out.print("Nhap n = ");
        int n = scanner.nextInt();
        System.out.printf("%d so nguyen to dau tien la: \n", n);
        int dem = 0;
        int i = 2;
        while (dem < n) {
            if (isPrimeNumber(i)) {
                System.out.print(i + " ");
                dem++;
            }
            i++;
        }
    }
}