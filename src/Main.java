import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in) ;
        int a, b, c, sum;
        System.out.print("input num1:");
        a = input.nextInt();
        System.out.print("input num2:");
        b = input.nextInt();
      System.out.print("input num3:");
        c = input.nextInt();
        sum=a+b-c;
       System.out.printf("%d+%d-%d=%d",a,b,c,sum);
       input.close();
     }
}
