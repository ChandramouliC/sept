package October.ex_18102024;

import java.util.Scanner;

//Reverse the String without using the any functions. (for loop)
public class ReverseString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String S=sc.nextLine();
        int i=0;
        String f=" ";
        for(char k:S.toCharArray()) {
            i++;
        }
        System.out.println(i);
        for(int l=i-1;l>=0;l--) {
            f = f+S.charAt(l);
        }
        System.out.println(f);
    }
}
