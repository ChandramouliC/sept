package October.Ex_02102024;
import java.util.Scanner;
public class ATBStudent
 {
     String Student_Name="Chandramouli";
     int age=23;
     int Roll_Number=10;
     String grade="A";
     String mail="1234@gmail.com";
     long Phone_number= 7894561230L;
     void Eat()
     {
         System.out.println(Student_Name);
 }
    void Sleep(){
        System.out.println(age);
    }
    void Walk(){
        System.out.println(Roll_Number);
    }
    void Run(){
        System.out.println(grade);
    }
    void Jump(){
        System.out.println(mail);
    }
    void Drink(){
        System.out.println(Phone_number);
    }
     public static void main(String[] args) {
         System.out.println("Print Student Information:");

         ATBStudent Display_Name=new ATBStudent();
         Display_Name.Eat();
         ATBStudent Disply_age=new ATBStudent();
         Disply_age.Sleep();
         ATBStudent Disply_Roll_Number=new ATBStudent();
         Disply_Roll_Number.Walk();
         ATBStudent Disply_grade=new ATBStudent();
         Disply_grade.Run();
         ATBStudent  Disply_mail =new ATBStudent();
         Disply_mail.Jump();
         ATBStudent Disply_Phone_number=new ATBStudent();
         Disply_Phone_number.Drink();

     }

}
