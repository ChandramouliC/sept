package September.ex_25092024;

import java.util.Scanner;

public class Lab04CountVowleConsonents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String name:");
        String i = sc.nextLine();

        System.out.println("Enter the starting position:");
        int j = sc.nextInt();

        int count = 0;
        int cons=0;

            for (; j <= i.length() - 1; j++) {
                if (i.charAt(j) == 'a' || i.charAt(j) == 'e' || i.charAt(j) == 'i' || i.charAt(j) == 'o' || i.charAt(j) == 'u'
                ||i.charAt(j) == 'A' || i.charAt(j) == 'E' || i.charAt(j) == 'I' || i.charAt(j) == 'O' || i.charAt(j) == 'U') {
                    count++;
                }
                else{
                    cons++;
                }
            }
            System.out.println("Vowles of given String :" + count);
        System.out.println("Consents of given String:"+cons);

    }
}
