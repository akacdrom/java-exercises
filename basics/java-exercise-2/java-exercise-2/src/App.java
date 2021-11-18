public class App {
    public static void main(String[] args) throws Exception {
        int sum = 0;
        for (int i = 1; i < 11; i++) {
            int randomNum = (int)(Math.random() * 30);
            System.out.println(i+" ==> "+randomNum);
            sum = randomNum + sum;
            
            if (i == 10) {
                System.out.println("------");
                System.out.println("Sum of numbers: "+sum);      
            }
        }
    }
}
