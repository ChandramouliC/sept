package October.Ex_04102024;

public class Person {
    String Name;
    int age;
    long Phone_number;
    String Address;
    String email;
    String Job;
    String Education;
    String Gender;
    boolean SingleORMarried;
    double Salary;
//default constructor
    public Person() {

    }

    public  void Person(){          // Default Constructor.
        System.out.println("Enter Peresons details:");
        System.out.println("==========");
    }
    Person(String name,int age,long Phone_Number,String Address,String Job,boolean SingleORMarried){   //Parametarised Constructor
        this.Name=name;
        this.age=age;
        this.Phone_number=Phone_Number;
        this.Address=Address;
        this. SingleORMarried= SingleORMarried;
}
    Person(String name,int age,String gender,String education,String Mail_Id,double Salary,boolean SingleORMarried){  //Parametarised Constructor
        this.Name=name;
        this.age=age;
        this.Gender=gender;
        this .Education=education;
        this.email=Mail_Id;
        this.Salary=Salary;
        this. SingleORMarried= SingleORMarried;
    }

    //Behaviour 1:
    void Walk(double Distance){
        System.out.println("Name: "+Name);
        System.out.println("Age: "+age);
        System.out.println("Education: "+Education);
        System.out.println("Address: "+Address);
        System.out.println(Distance+"Km");
        System.out.println("----------");
    }
    // Behaviour 2:
    void Jump(){
        System.out.println("Name: "+Name);
        System.out.println("Gender: "+Gender);
        System.out.println("Education: "+Education);
        System.out.println("==========");
    }
    // Behaviour 3:
    void Meditation(){
        System.out.println("Name: "+Name);
        System.out.println("Address: "+Address);
        System.out.println("Job: "+Job);
        System.out.println("Salary: "+Salary);
        System.out.println("Marriage Status: "+SingleORMarried);
        System.out.println("-------");
    }
    // Behaviour 4:
    void Sleep(int Time){
        System.out.println("Name: "+Name);
        System.out.println("Education: "+Education);
        System.out.println("PhoneNumber: "+Phone_number);
        System.out.println("Email: "+email);
        System.out.println(Time+"hr Sleeping Time");
        System.out.println("===========");
    }
    // Behaviour 5:
    void Eat(String Item){
        System.out.println("Name: "+Name);
        System.out.println("Job: "+Job);
        System.out.println("PhoneNumber: "+Phone_number);
        System.out.println("Salary: "+Salary);
        System.out.println("Marriage Status: "+SingleORMarried);
        System.out.println(Item);
    }
    public static void main(String[] args) {

        Person person=new Person();

       Person Person1=new Person("Chandra",23,4567891243L,"India","Tester",true);
       Person1.Walk(15);

        Person Person2=new Person("Mouli",22,"Male","B.tech","2344@gmail.com",20000.0d,false);
        Person2.Jump();

        Person Person3=new Person("Navya",25,4567235603L,"India","QA Tester",false);
        Person3.Meditation();

        Person Person4=new Person("Syam",27,"Male","B.tech","25684@gmail.com",50000.0d,true);
        Person4.Sleep(7);

        Person Person5=new Person("Tharun",22,"Male","B.tech","28974@gmail.com",25000.0d,true);
        Person5.Eat("Chapathi");
    }
}
