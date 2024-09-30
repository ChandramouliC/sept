package September.ex_30092024;

import java.util.Scanner;

public class Lab03CountVowlConsonentString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Stsring Name:");
        String l=sc.nextLine();
        System.out.println("Enter a position to Stsrt the count:");
        int m=sc.nextInt();

        int V = 0;
        int C=0;

        while(m<l.length()){
            if (l.charAt(m) == 'a' || l.charAt(m) == 'e' || l.charAt(m) == 'i' || l.charAt(m) == 'o' || l.charAt(m) == 'u'
                    ||l.charAt(m) == 'A' || l.charAt(m) == 'E' || l.charAt(m) == 'I' || l.charAt(m) == 'O' || l.charAt(m) == 'U')
            {
                V++;
            }
            else
                C++;
            m++;
        }
        System.out.println("Count Of Vowels:"+V);
        System.out.println("Count Of Consonents:"+C);
    }
}

/* for (int j=1; j <= l.length() - 1; j++) {
            if (l.charAt(j) == 'a' || l.charAt(j) == 'e' || l.charAt(j) == 'i' || l.charAt(j) == 'o' || l.charAt(j) == 'u'
                    ||l.charAt(j) == 'A' || l.charAt(j) == 'E' || l.charAt(j) == 'I' || l.charAt(j) == 'O' || l.charAt(j) == 'U') {
                V++;
            }
            else{
                C++;
            }
        }
        System.out.println("Vowles of given String :" + V);
        System.out.println("Consents of given String:"+C);*/
