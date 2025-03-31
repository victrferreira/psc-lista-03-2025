package lista03;
import java.util.Scanner;
public class exerci05 {
    public static void main(String[] args) {
        double numero1,numero2;
        char simbolo;
        Scanner texto= new Scanner(System.in);
        System.out.print("Escreva o primeiro número:");
        numero1=texto.nextDouble();
        System.out.print("Escreva o segundo número:");
        numero2=texto.nextDouble();
        System.out.print("Escolha o simbolo da operação *:Multiplicação /:Divisão -:Subtração +:Soma ^:XOR" +
                "");
        simbolo=texto.next().charAt(0);

        switch (simbolo) {

            case '*':
                double resultado = numero1 * numero2;
                System.out.println("Operação=" + resultado);
                break;

            case '/':

                double resultado2 = numero1 / numero2;
                System.out.println("Operação=" + resultado2);
                break;

            case '-':
                double resultado3 = numero1 - numero2;
                System.out.println("Operação=" + resultado3);
                break;

            case '+':
                double resultado4 = numero1 + numero2;
                System.out.println("Operação=" + resultado4);
                break;

            case '^':
                double resultado5 = Math.pow(numero1, numero2);
                System.out.println("Operação=" + resultado5);
                break;
        }

        texto.close();



    }
}
