package October.Ex_25102024;

import java.util.Scanner;

public class PyramidPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of the Pyramid pattern");
        int L = sc.nextInt();
        for(int k=1;k<=L;k++){
            for(int n=k;n<=L-1;n++){
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * k) - 1; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
