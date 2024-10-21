package October.Ex_14102024;

public class  PrintMyBook extends Book {
@Override
    void getDetails( String Name,String Author, int Price) {
    System.out.println(Name);
    System.out.println(Author);
    System.out.println(Price);
}
public static void main(String[] args){
        Book myBook = new PrintMyBook();
        myBook.getDetails("Harry Potter", "J.k. Rowling", 100);
    }
}
