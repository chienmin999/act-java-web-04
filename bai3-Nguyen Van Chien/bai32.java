//Bai 2: Viet chuong trinh tinh giai thua cua so nguyen duong n. vowis n nhap tu ban phim
package bai3;

/**
 *
 * @author ADMIN
 */
import java.util.Scanner;
public class bai32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap n: ");
        float n = input.nextInt();
        int i;
        int gt = 1;
        for(i=1;i<=n;i++){
            gt*= i;
        }
        System.out.println("Gia tri cua n giai thua = "+gt);
}
}