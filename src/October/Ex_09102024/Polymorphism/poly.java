package October.Ex_09102024.Polymorphism;

public  class poly {
    void No_Students(int ClassName) {
        System.out.println(10);
    }
    // Overloading
void No_Students(int ClassName,int count){
    System.out.println(ClassName);
    System.out.println(count);
}
}
     class SectionA extends poly
     {
        @Override
        void No_Students(int ClassName)
        {
            System.out.println(ClassName);
        }
            public static void main(String[] args)
            {
                poly Details=new SectionA();
                Details.No_Students(9);
                Details.No_Students(9,60);
            }
     }





