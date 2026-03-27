//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//public class Main {
  //  public static void main (String[] args) {

        /*
        ********TRABALHANDO COM IF/ELSE********
        String usuario = "ad2min";
        String senha = "12234";
        int tentativas =4;

        if (tentativas >=3) {
            System.out.println("ACESSO BLOQUEADO POR EXCESSO DE TENTATIVAS");
        }

        else if (usuario.equals("admin") && senha.equals("1234")) {
            System.out.println("Acesso autorizado para o usuário " + usuario);
        }

        else if (usuario.equals("admin")){
            System.out.println("Senha Incorreta. Tentativas: " + tentativas);
        }

        else if (senha.equals("1234")) {
            System.out.println("Usuário Incorreto. Tentavias: " + tentativas);
        }

        else if (!senha.equals("1234") && !usuario.equals("admin")) {
            System.out.println("Usuário e Senha Incorretos. Tentativas: " + tentativas);
        }

    }
}
  */

    //************LAÇOS DE REPETIÇÃO***************//

    /*public class Main {
    public static void main (String[] args) {

        int i = 1; variável declarada fora do FOR, mas também pode ser declarada diretamente dentro do FOR, fazendo com que ela exista apenas dento do loop

        for (i = 1; i <= 10; i++){
            System.out.printf("Contagem da estrtura de repetição FOR, sendo esse o número: %d \n", i);
        }

        System.out.println("\nFim da Contagem!");
    }
    }

    */

public class Main {
    public static void main (String[] args) {

        System.out.println("********CONTADOR DE NÚMEROS PARES E ÍMPARES********");

        for (int i = 0; i <= 20; i++){
            if (i % 2 == 0){
                System.out.printf("Contagem de números, sendo esse o número: %d que é PAR ✅\n", i);
            }

            else {
                System.out.printf("Contagem de números, sendo esse o número: %d que é ÍMPAR ✅\n", i);
            }
        }
        System.out.println("\nFim da contagem de números");
    }
}