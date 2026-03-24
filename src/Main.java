//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main (String[] args) {
        double nota = 4.9999;

        if (nota >= 7){
            System.out.println("Aluno aprovado com nota " + nota);
        }

        else if (nota <7 && nota >= 5) {
            System.out.println("Aluno de Recuperação com nota " + nota);
        }

        else {
            System.out.println("Aluno reprovado com nota " + nota);
        }

    }
}