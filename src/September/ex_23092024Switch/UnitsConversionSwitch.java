package September.ex_23092024Switch;

public class UnitsConversionSwitch {
    public static void main(String[] args) {

        float km = 10;
        float fh = 50;
        double r = 0;
        switch(2)
    {
        case 1:
            r = km * 1000;
            System.out.println(r + "m");
            break;
        case 2:
            r = (fh - 32) * 5 / 9;
            System.out.println(r + "°c");
            break;
        default:
            System.out.println("Not possible to conversion");
    }
    }
}
