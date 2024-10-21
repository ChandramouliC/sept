package October.Ex_11102024;

public class TestCaseAPI extends BaseClass {
    int age,years; String Name;boolean married;
    int store=90;
    //access super class constructors
//default constructor and super default constructor
    TestCaseAPI()
    {
        super();
    }
     //parameterized cons and super parameterized constr
    TestCaseAPI(String Name, int age,boolean married)
    {
        super("mouli",26);
        System.out.println(married);
    }
//super class variables
    void SuperVariables()
    {
        System.out.println(store);
        System.out.println(super.store);
        System.out.println(this.store);
    }
    //super class methods
    void SuperMethod()
    {
        super.setId(56);
    }
//override PerformPOST
    @Override
    void performPOST(String Address,int PostalCode){
        System.out.println(Address);
        System.out.println(PostalCode);
        System.out.println("Overload methods in child class");
    }
    //overload performPUT and now overload can take in 2 classes
    void performPUT(boolean job)
    {
        System.out.println("do you have job :"+job);
    }

}
