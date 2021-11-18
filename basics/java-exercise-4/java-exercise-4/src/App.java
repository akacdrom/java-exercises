public class App {
    public static void main(String[] args) throws Exception {
        
        for (float i = 1f; i < 11; i++) {

            float a = i/2;
       
            if (a == (int)a) {
                System.out.println(Math.round(i)+" +++++");    
            }
            else {
                System.out.println(Math.round(i));
            }
        }
    }
}
