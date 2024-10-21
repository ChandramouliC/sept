package September.ex_25092024;
import java.util.Scanner;
public class Lab02Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the factorial number:");
        int i=sc.nextInt();

        int fact=1;
        for(int j=1;j<=i;j++) {
            fact=fact*j;
        }
        System.out.println("Factorial of "+i+" Value is:"+fact);
    }

}


