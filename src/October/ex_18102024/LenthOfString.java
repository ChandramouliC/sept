package October.ex_18102024;

import java.util.Scanner;

//Calculate the length of the String - without using the length() function.
// String name =”Pramod”; →  6 , CharArray, for loop
public class LenthOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String ");
        String N=sc.nextLine();
       int i=0;
        for(char k:N.toCharArray())
            i++;
        System.out.println(i);
    }
}
