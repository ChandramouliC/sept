package September.ex_25092024;
import java.util.Scanner;
public class Lab01Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of table :");
        int j = sc.nextInt();

        System.out.println("Enter the Starting of table  :");
        int k = sc.nextInt();

        System.out.println("Enter the ending of table:");
        int L = sc.nextInt();
      /*  // For loop
        for (; k < L; k++) {
            System.out.println(j + "*" + k + "=" + j * k);
        }*/

        // while loop
        while (k<=L){
            System.out.printf("%d * %d = %d " , j,k,j*k);
            System.out.println();
            k++;
        }
    }
}
