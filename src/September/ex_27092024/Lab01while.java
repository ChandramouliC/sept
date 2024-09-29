package September.ex_27092024;

import java.util.Scanner;

// print numbers in reverse order
public class Lab01while {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A number to Start:");
        int i=sc.nextInt();
        System.out.println("Enter a number to end :");
        int k = sc.nextInt();
        if (i>k){
        while(i>=k){
            System.out.println(i);
            i--;
        }}
        else if (k>i) {
            while(k>=i) {
                System.out.println(k);
                k--;
            }
        }
        else
            System.out.println("Both numbers are equal");
    }
}
