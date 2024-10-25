package October.Ex_25102024;

import java.util.Scanner;

public class LeftTriangularPatter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of the Left Triangular pattern");
        int L = sc.nextInt();
        for (int i = L; i >=0; i--) {
            for (int k = i; k >0; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
