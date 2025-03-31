package lista03;
import java.util.Scanner;
import java.util.Random;
public class exerci06 {
    public static void main(String[] args) {
        Scanner texto= new Scanner(System.in);

        int numero1, numero2;
        int menor, maior;

        System.out.println("Seja bem vindo");

        System.out.println("Escreva aqui o primeiro número:");
        numero1= texto.nextInt();

        System.out.println("Escreva aqui o segundo número:");
        numero2= texto.nextInt();

        menor= Math.min(numero1,numero2);
        System.out.println("O número menor é:"+menor);
        maior= Math.max(numero1,numero2);
        System.out.println("O número maior é:"+maior);


        Random random=new Random();
        int sorteio = random.nextInt(2) == 0 ? numero1 : numero2; 

        // Verificação se o número sorteado é par ou ímpar
        if (sorteio % 2 == 0) {
            System.out.println("O número " + sorteio + " é par.");
        } else {
            System.out.println("O número " + sorteio + " é ímpar.");
        }
    }
}
