//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main (String[] args) {
        System.out.println("=== TABELA VERDADE ===");
        System.out.println();

        // AND (&&)
        System.out.println("=== AND (&&) ===");
        System.out.println("true && true = " + (true && true));
        System.out.println("true && false = " + (true && false));
        System.out.println("false && true = " + (false && true));
        System.out.println("false && false = " + (false && false));
        System.out.println();

        // OR (||)
        System.out.println("=== OR (||) ===");
        System.out.println("true || true = " + (true || true));
        System.out.println("true || false = " + (true || false));
        System.out.println("false || true = " + (false || true));
        System.out.println("false || false = " + (false || false));
        System.out.println();

        // NOT (!)
        System.out.println("=== NOT (!) ===");
        System.out.println("!true = " + (!true));
        System.out.println("!false = " + (!false));

    }
}