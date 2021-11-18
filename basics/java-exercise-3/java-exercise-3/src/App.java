public class App {
    public static void main(String[] args) throws Exception {
        int[] myNum = {8, 5, 2, 9, 3};
        int biggest = myNum[0];
            for (int i = 0; i < myNum.length; i++) {
                if (myNum[i] > biggest) {
                    biggest = myNum[i];
                }
            }
            System.out.println(biggest);
    }
}
