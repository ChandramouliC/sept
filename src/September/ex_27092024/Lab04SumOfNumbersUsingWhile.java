package September.ex_27092024;

import java.util.Scanner;

public class Lab04SumOfNumbersUsingWhile {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value of Statring number:");
        int i = sc.nextInt();

        System.out.println("Enter the value of ending number: ");
        int k=sc.nextInt();
        int sum=0;
        while(i<=k){
             sum=sum+i;
            i++;
        }
        System.out.println(sum);

    }
}
