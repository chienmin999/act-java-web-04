/*Bài 5
1. Tính tổng nguyên: S = 1 + 1/2 + 1/3 + 1/4 +… 1/n
2. Tính tổng S(n) = 1+2+3+4+ … +n
3. Tính tổng S(n) = 1^2 + 2^2 + … + n^2
4. Tính tổng S(n) = 1/2 + 1/4 + 1/6 + 1/8 + 1/2n
5. Tính tổng S(n) = 1 + 1/3 + 1/5 + 1/(2n+1)
6. Tính tổng S(n) = 1/(1*2) + 1/(2*3) + … +1/(n*(n+1))
7. Tính tổng S(n) = 1/2 + 3/4 + 5/6 +…+ (2n+1)/(2n+2)
8. Tính tổng S(n) = 1 + 1.2 + 1.2.3 + … + 1.2…n
9. Tính tổng S(x, n) = x + x^2 + x^3 +…+ x^n
10. Tính tổng S(x, n) = x^2 + x^4 + x^6 +…+ x^2n
11. Tính tổng S(x, n) = x + x^3 + x^5 +…+ x^(2n+1)
12. Tính tổng S(n) = 1 + 1/(1+2) + 1/(1+2+3) +…+ 1/(1+2+3+…+n)*/
package bai3;

import static java.lang.Math.pow;
import java.util.Scanner;
public class bai35 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n = input.nextInt();
        int i ;
        float S1 = 0;
        for (i=1;i<=n;i++){
           S1+= (float) 1/i;
        }
        System.out.println("Tính tổng : S1= "+S1);//bai1
        int S2 = 0;
        for (i=1;i<=n;i++){
           S2+= i;
        }
        System.out.println("Tính tổng : S2= "+S2);//bai2
        int S3 = 0;
        for (i=1;i<=n;i++){
            S3+= pow(i,2);
        }
        System.out.println("Tính tổng : S3= "+S3);//bai3
        float S4 = 0;
        for (i=2;i<=2*n;i=i+2){
           S4+= (float) 1/i;
        }
        System.out.println("Tính tổng : S4= "+S4);//bai4
        float S5 = 0;
        for (i=1;i<=2*n+1;i=i+2){
           S5+= (float) 1/i;
        }
        System.out.println("Tính tổng : S5= "+S5);//bai5
        float S6 = 0;
        for (i=1;i<=n;i++){
           S6+= (float) 1/(i*(i+1));
        }
        System.out.println("Tính tổng : S6= "+S6);//bai6
        float S7 = 0;
        for (i=1;i<=2*n+1;i=i+2){
            S7+= (float) i/(i+1);
        }
        System.out.println("Tính tổng : S7= "+S7);//bai7
        int S8 = 0;
        int p =1;
        for(i = 1; i <= n; i++){
            p *= i;
            S8 += p;
        }
        System.out.println("Tính tổng : S8= "+S8);//bai8
        System.out.println("Nhap x: ");
        int x = input.nextInt();
        int S9 = 0;        
        for (i=1;i<=n;i++){
            S9+= pow(x,i);
        }
        System.out.println("Tính tổng : S9= "+S9);//bai9
        int S10 = 0;        
        for (i=2;i<=2*n;i=i+2){
            S10+= pow(x,i);
        }
        System.out.println("Tính tổng : S10= "+S10);//bai10
        int S11 = 0;        
        for (i=1;i<=2*n+1;i=i+2){
            S11+= pow(x,i);
        }
        System.out.println("Tính tổng : S11= "+S11);//bai11
        float S12 = 0;
        int s=0;
        for (i=1;i<=n;i++){
            s+=i;
           S12+= (float) 1/s;
        }
        System.out.println("Tính tổng : S12= "+S12);//bai12
    }
}
