package October.Ex_11102024;

public class RunnerClass {
    public static void main(String[] args) {
        BaseClass employee= new TestCaseAPI();
        BaseClass c=new TestCaseAPI("anbjhs",78,true);
        TestCaseAPI t=new TestCaseAPI();

        t.SuperVariables();
        employee.setName("Navya");
        t.SuperMethod();
        t.performPOST("Prakasam",523101);
        t.performPOST("navya",7908);
        employee.performGet(9);
        employee.performGET();
        t.performPUT(true);
        employee.performPUT();
    }
}
