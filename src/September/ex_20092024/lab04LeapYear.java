package September.ex_20092024;

public class lab04LeapYear {
    public static void main(String[] args) {
        int Year= 2022;
        if (Year%4==0 && Year%100!=0 || Year%400==0){

            System.out.println("It's a leap Year");
        }
        else
            System.out.println("It's not a Leap Year");
    }
}
