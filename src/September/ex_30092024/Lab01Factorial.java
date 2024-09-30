package September.ex_30092024;
import java.util.Scanner;
public class Lab01Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number:");
        int l=sc.nextInt();
        int r=1;
        for(int n=l;n>=1;n--)
        {
            if (n==l)
                System.out.print(n);
            else
                System.out.print("*"+n);
            r=n*r;
        }
        System.out.println("="+r);
    }
}
