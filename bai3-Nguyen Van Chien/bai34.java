/*
Bài 4
1. Viết chương trình cho phép người dùng nhập vào 1 số nguyên cho đến khi
người dùng nhập số 0 thì dừng lại và in ra số lớn nhất mà người dùng vừa nhập
2. Viết chương trình cho phép người dùng nhập vào 1 số nguyên cho đến khi
người dùng nhập số 0 thì dừng lại và in ra số nhỏ nhất mà người dùng vừa nhập
 */
package bai3;
import java.util.Scanner;
public class bai34 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] b = new int[20];
        for (int  i = 1; i < 20; i++) {
            System.out.printf("Nhap so nguyen thu %d: ",i);
            b[i] = input.nextInt();
            if (b[i]==0){
                break;
            }
        }
        int max = b[0];
        int min = b[0];
        for(int j=0; j< b.length ; j++){
            if(b[j]>max){
                max=b[j];
            }
            if(b[j] <min){
                min=b[j];
            }
        }
        System.out.println("Gia tri lon nhat la: "+max);
        System.out.println("Gia tri nho nhat la: "+min);

    }
}
