//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main (String[] args) {

        String usuario = "admin";
        String senha = "1234";
        int tentativas = 3;

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