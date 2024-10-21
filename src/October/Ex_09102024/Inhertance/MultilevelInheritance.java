package October.Ex_09102024.Inhertance;

public class MultilevelInheritance {
    void Sr_Salary(){
        System.out.println(50000);
    }
}
class job extends MultilevelInheritance{
    void Jr_salary(){
        System.out.println(35000);
    }
}
class post extends job{
    void Trainee(){
        System.out.println(15000);
    }
}

class Salary {
    public static void main(String[] args) {
        post S=new post();
        S.Sr_Salary();
        S.Jr_salary();
        S.Trainee();
    }
}
