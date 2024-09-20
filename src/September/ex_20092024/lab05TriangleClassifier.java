package September.ex_20092024;

public class lab05TriangleClassifier {
    public static void main(String[] args) {
        int a=50;
        int b=20;
        int c=50;
        if (a==b && a==c && b==a)
            System.out.println("Equliteral Traingle");

        else if(a!=b && b!=c && c!=a)
            System.out.println("Scalene Triangle");

        else
            System.out.println("Isosceles Triangle");

    }
}
