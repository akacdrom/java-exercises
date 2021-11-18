import java.sql.Date;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Year;
import java.time.format.DateTimeFormatter;
public class App {
    public static void main(String[] args) throws Exception {
        int thisYear = Year.now().getValue();

        LocalDate new_year = LocalDate.of(thisYear, 01, 01);

        DateTimeFormatter parsed_day = DateTimeFormatter.ofPattern("dd");
        DateTimeFormatter parsed_year = DateTimeFormatter.ofPattern("yyyy");
        DateTimeFormatter parsed_month = DateTimeFormatter.ofPattern("MM");

        int counted_day = 0;
        while (true) {
            
            //System.out.println("Mon Tue Wen Thu Fri Sat Sun");
                
                //System.out.println(next_day.format(parsed_day));
                while (true){
                LocalDate next_day = new_year.plusDays(counted_day++);
                Integer parsed_year_to_int = Integer.valueOf(next_day.format(parsed_year));
              
                if (thisYear < parsed_year_to_int) {
                    System.exit(0);
                }
                Integer parsed_day_to_int = Integer.valueOf(next_day.format(parsed_day));
              
                if (parsed_day_to_int ==  01) {
                    System.out.printf("%n------------------------------------------%n");
                    //name of month
                    System.out.printf("%n######## %TB ######## %n%n",next_day);
                    //day names of week
                    System.out.println("Mon Tue Wen Thu Fri Sat Sun");
                    System.out.printf("^^^^^^^^^^^^^^^^^^^^^^^^^^^%n%n");

                    java.time.DayOfWeek dayOfWeek = next_day.getDayOfWeek();
                    if (dayOfWeek.toString() == "MONDAY") {
                        System.out.printf("%td",next_day);
                    }
                    else if (dayOfWeek.toString() == "TUESDAY") {
                        System.out.printf("%6td",next_day);
                    }
                    else if (dayOfWeek.toString() == "WEDNESDAY") {
                        System.out.printf("%10td",next_day);
                    }
                    else if (dayOfWeek.toString() == "THURSDAY") {
                        System.out.printf("%14td",next_day);
                    }
                    else if (dayOfWeek.toString() == "FRIDAY") {
                        System.out.printf("%18td",next_day);
                    }
                    else if (dayOfWeek.toString() == "SATURDAY") {
                        System.out.printf("%22td",next_day);
                    }
                    else if (dayOfWeek.toString() == "SUNDAY") {
                        System.out.printf("%26td %n",next_day);
                    }
                    
                    break;
                }
                else {
                    java.time.DayOfWeek dayOfWeek = next_day.getDayOfWeek();
                    if (dayOfWeek.toString() == "MONDAY") {
                        System.out.printf("%td",next_day );
                    }
                    else {
                    System.out.printf("%4td",next_day);
                    }
                  
                    if (dayOfWeek.toString() == "SUNDAY") {
                        System.out.println();
                    }
                   
                }

            }   
        }
    }
}
