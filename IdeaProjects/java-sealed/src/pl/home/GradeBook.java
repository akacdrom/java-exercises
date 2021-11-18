package pl.home;
import java.util.*;

public class GradeBook {

    public static void main(String[] args) {
        myFunc();

    }

    public static void myFunc(){
        Scanner myObj = new Scanner(System.in);
        String myString = myObj.nextLine();

        ArrayList<String> numbers = new ArrayList<String>();
        numbers.add(myString);
        numbers.forEach( (n) -> { System.out.println(n); } );
    }
}
