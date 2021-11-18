public class App {
    public static void main(String[] args) throws Exception {
        for (int i = 10; i > 0; i--) {
            System.out.print(i+"    ");
            for (int j = 0; j < 6; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}