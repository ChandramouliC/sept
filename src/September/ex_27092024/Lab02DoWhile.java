package September.ex_27092024;

import java.util.Scanner;

// Sum of a digit of a number
public class Lab02DoWhile {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Integer Value:");
        int i=sc.nextInt();
        int count=0,r=0;
        do{
            r=i%10;
            count=count+r;
            i=i/10;
            }
        while(i>0);
        System.out.println(count);
    }
}
