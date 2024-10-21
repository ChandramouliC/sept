package October.Ex_09102024.Polymorphism;

public class OverLoading {

    //changing data type of arguments
    void Company_Names(String Name,int Branches){
        System.out.println("Before Overloading Values");
        System.out.println(Name);
        System.out.println(Branches);
    }
    void Company_Names(String Name,double Branches){
        System.out.println("After overloading Values");
        System.out.println(Name);
        System.out.println(Branches);
    }

    public static void main(String[] args) {
        OverLoading Details=new OverLoading();
        Details.Company_Names("Accenture",4);
        Details.Company_Names("Tcs",2.5);
        Details.ages(12,25,45);
        Details.ages(45,63);
    }

    // changing no.of Arguments

    void ages(int age1,int age2){
        System.out.println("No Of Arguments - 2");
        System.out.println(age1+age2);
    }
    void ages(int age1,int age2,int age3){
        System.out.println("No Of Arguments - 3");
        System.out.println(age1+age2+age3);
    }
}
