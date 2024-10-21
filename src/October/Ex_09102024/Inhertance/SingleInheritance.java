package October.Ex_09102024.Inhertance;

public class SingleInheritance {
    void Unicorn(){
        System.out.println("5 Gears");
    }
}

class Model extends SingleInheritance{
    void Activa() {
        System.out.println("No Gears");
    }
}

class BikeType{
    public static void main(String[] args) {
        Model B=new Model();
        B.Unicorn();
        B.Activa();
    }
}