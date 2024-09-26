package September.ex_25092024;
import java.util.Scanner;
public class Lab03Primenumber {
    public static void main(String[] args) {

                System.out.println("Prime numbers of 1-100 :");
                
        Scanner sc=new Scanner(System.in);
                System.out.println("Enter the starting value:");
                int i=sc.nextInt();

                System.out.println("Enter the end value:");
                int k=sc.nextInt();

                for( ;i<=k;i++) {
                    int count=0;
                    for(int j=1;j<=i;j++) {
                        if(i%j==0)
                            count++	;
                    }
                    if(count==2)
                        System.out.println(i);
                }
            }
}
