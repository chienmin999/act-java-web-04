//Bài 1: Viết chương trình giải phương trình bậc hai dang ax^2+bx+c=0 với a,b,c là 3 số
//thực nhập vào từ bàn phím
package bai3;
import static java.lang.Math.sqrt;
import java.util.Scanner;
public class Bai3 {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap a: ");
        float a = input.nextInt();
        System.out.print("Nhap b: ");
        float b = input.nextInt();
        System.out.print("Nhap c: ");
        float c = input.nextInt();
        float delta = b*b-4*a*c;
        if (a==0){
            float x= (float) -c/b;
            System.out.println("Phuong trinh co 1 nghiem duy nhat: x= "+x);
        }
        else{
            float x = 0;
        if (delta>0){
            float x1 = (float) ((-b-sqrt(delta))/(2*a));
            float x2 = (float) ((-b+sqrt(delta))/(2*a));
            System.out.println("Phuong trinh co hai nghiem /n x1= "+x1+"/n x2= "+x2);
        }
        else if (delta == 0){
            x= (float) (-b/(2*a));
            System.out.println("Phuong trinh co nghiem kep: x1 = x2 = "+x);
        }
        else{
            System.out.println("Phuong trinh Phuong trinh vo nghiem");
        }
    }
}
}
