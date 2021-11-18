import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        ArrayList<String> values = new ArrayList<String>(); // Create an ArrayList object      

        while (true) {

            System.out.println("Enter input:");
            String value = myObj.nextLine();  // Read user input
                   
            if (Objects.equals(value, "end")) {
                
                for (int i = 0; i < values.size(); i++) {

                    for (int j = i + 1; j < values.size(); j++) {

                        if (Objects.equals(values.get(i), values.get(j))) {
                        System.out.println(values.get(j));
                        
                        }
                    }
                  }

                break;
            }
            values.add(value);
        }
    }
}
