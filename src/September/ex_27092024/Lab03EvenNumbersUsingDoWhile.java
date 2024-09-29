package September.ex_27092024;

import java.util.Scanner;

public class Lab03EvenNumbersUsingDoWhile {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Starting of the number:");
        int i=sc.nextInt();

        System.out.println("Ending of the number:");
        int j=sc.nextInt();

        int count=0;
        do
        {
            if(i%2==0){
                System.out.println(i);
                count++;
            }
            i++;
        }
        while(count<j);
    }
}
