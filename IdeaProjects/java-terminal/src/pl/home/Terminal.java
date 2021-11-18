package pl.home;

public class Terminal {
    private static Terminal aTerminal = null;
    public static Terminal createTerminal() {
           if (aTerminal == null) {
               aTerminal = new Terminal();
           }
           return aTerminal;
    }

}
