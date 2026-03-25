//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main (String[] args) {

        String usuario = "adminn";
        String senha = "12345";

        if (usuario.equals("admin") && senha.equals("1234")){
            System.out.println("Acesso autorizado para o usuário " + usuario);
        }

        else if (!usuario.equals("admin") && !senha.equals("1234")){
            System.out.println("Usuário e Senha Incorretos ");
        }

        else if (usuario.equals("admin")) {
            System.out.println("Senha Incorreta");

        }
        else{
            System.out.println("Usuário incorreto");
        }

    }
}