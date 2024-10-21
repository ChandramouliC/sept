package October.Ex_11102024;

public class BaseClass {

    private String name="Challa";
    private int id=21;
    int store=76;

    BaseClass()
    {
        System.out.println("Default constructor");
    }
    BaseClass(String name, int id)
    {
        this.id=id;
        this.name=name;
        System.out.println("parameterized constructor");
        System.out.println(id);
        System.out.println(name);
    }

    public String getName() {
        System.out.println(name);
        return name;
    }
    public void setName(String name) {
        this.name = name;
        System.out.println(name);
    }

    public int getId() {
        System.out.println(id);
        return id;
    }
    public void setId(int id) {
        this.id = id;
        System.out.println(id);
    }

    void performGET(){
        System.out.println("Encapsulation");
    }
    void performPOST(String Address,int PostalCode){
        System.out.println(Address);
        System.out.println("child class method overload");
    }

    void performPATCH(){
        System.out.println("Inheritance");
    }

    void performPUT(){
        System.out.println("this");
    }

    void performDELETE(){
        System.out.println("Super");
    }
    //overload perform get method---here overloaded in single class
    void performGet(int baby)
    {
        System.out.println(baby);
    }
}
