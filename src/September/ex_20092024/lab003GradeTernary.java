package September.ex_20092024;

public class lab003GradeTernary {
    public static void main(String[] args) {
        int Score = 85;
        String Grade = (Score>=90)? "A" : (Score>=80)? "B" : (Score>70)? "C": "F" ;
        System.out.println(Grade);
    }
}
