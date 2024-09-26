package September.ex_23092024Switch;

public class CalculatorSwitch {
    public static void main(String[] args) {
        int num1=10;
        int num2=20;

        switch (1){
            case 1:
                System.out.println("Addition of two values" +" -"+ (num1+num2));
                break;
            case 2:
                System.out.println("Subtraction of two values" + " -"+(num1-num2));
                break;
            case 3:
                System.out.println("Multiplication of two values" + " -"+(num1*num2));
                break;
            case 4:
                System.out.println("Division of two values" + " -"+(num1/num2));
                break;
            case 5:
                System.out.println("Modulus of two values" + " -"+(num1%num2));
                break;
            default :
                System.out.println("Error");
        }

    }
}
