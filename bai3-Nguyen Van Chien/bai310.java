/*Bài 10.
Viết chương trình nhập vào số nguyên n, kiểm tra số đó có phải là số đối xứng hay
không.
Số đối xứng hay còn gọi là “palindrome”. Ví dụ: 123321 là số đối xứng, 12012
không phải số đối xứng.
 */
package bai3;
import java.util.Scanner;
public class bai310 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n = input.nextInt();
        int sogoc =n;
        int sodao=0;
        int donvi;
        while(sogoc>0){
            donvi = sogoc % 10;
            sodao = sodao*10 + donvi;
            sogoc = sogoc / 10;
        }
        if (sodao == n){
            System.out.printf("%d la so doi xung",n);
        }
        else{
            System.out.printf("%d khong la so doi xung",n);            
        }
    }
}
