package October.Ex_09102024.Polymorphism;

public class OverRiding {
    void marks(int S1,int S2){
        System.out.println(S1);
    }
}

class Students extends OverRiding{
    void marks(int S1,int S2){
        System.out.println(S2);
    }

    public static void main(String[] args) {
        OverRiding School=new Students();
        School.marks(25,30);
    }
}
