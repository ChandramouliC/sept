package October.Ex_09102024.Inhertance;

public class HierarchicalInheritance {
    void Mother(){
        System.out.println("Saritha");
    }
}
class Hierarchical extends HierarchicalInheritance{
    void Sister(){
        System.out.println("Navya");
    }
}
class Inheritance extends HierarchicalInheritance{
    void Brother(){
        System.out.println("Tharun");
    }
}

class Family_Members{
    public static void main(String[] args) {
        Inheritance Name=new Inheritance();
        Name.Mother();
        Name.Brother();

        Hierarchical Name1=new Hierarchical();
        Name1.Sister();
    }
}
