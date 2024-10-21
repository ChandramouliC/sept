package October.Ex_09102024.Inhertance;

public abstract class L01 {
   // public  class Person {
        abstract void getDetails(int n);
    }

    class person2 extends L01/*Person*/{
        @Override
        void getDetails(int n) {
            System.out.println("Challa");
            System.out.println(n);
        }
    }

    class person3 extends L01/*Person*/ {
        @Override
        void getDetails(int z) {
            System.out.println("Chandra");
            System.out.println(z);
        }
    }
    class MainPerson {
        public static void main (String[] args) {
            L01 name=new person3();
            name.getDetails(6);

            L01 Initial=new person2();
            Initial.getDetails(7);
        }
    }

