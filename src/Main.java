//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       int a = 10;
       int b = 3;

       int soma = a + b;
       int subtracao = a - b;
       int divisao = a / b;
       int multiplicacao = a * b;
       int resto = a % b;
       double divisaoDecimal = (double) a / b;

       double peso = 70.0;
       double altura = 1.60;
       double imc = (double) peso / (double) (altura*altura);

        System.out.println("Soma: " + soma);
        System.out.println("Subtrção: " + subtracao);
        System.out.println("Divisão: " + divisao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Resto: " + resto);
        System.out.println("Divisão Decimal: " + divisaoDecimal);

        System.out.println("Meu IMC é: " + imc);









        }
    }
