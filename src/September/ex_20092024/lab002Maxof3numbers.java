package September.ex_20092024;

public class lab002Maxof3numbers {
    public static void main(String[] args) {
        int a=300;
        int b=200;
        int c=50;

       int max=(a>b)?((a>c)?a:c):((b>c)?b:c);
        {
            System.out.println(max);
        }
    }

}
