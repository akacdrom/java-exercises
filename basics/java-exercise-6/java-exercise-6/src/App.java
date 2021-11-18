
public class App {

    static void myMethod(int arg1){
        for (int i = 0; i <= arg1; i++) {
            System.out.print(i);
        }
    }
    public static void main(String[] args) throws Exception {
        myMethod(7);
        System.out.println("");
        myMethod(4);

    }
}
