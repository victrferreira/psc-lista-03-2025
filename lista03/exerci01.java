package lista03;

import java.util.Scanner;
public class exerci01 {
    public static void main(String[] args) {
        int numero1, numero2, numero3, media;
        Scanner texto= new Scanner(System.in);

        System.out.println("Seja bem vindo!");
        System.out.print("Escreva o primeiro número aqui:");
        numero1=texto.nextInt();
        System.out.print("Escreva o segundo número aqui:");
        numero2=texto.nextInt();
        System.out.print("Escreva o terceiro número aqui:");
        numero3=texto.nextInt();
        media= (numero1+numero2+numero3)/3;

        if (numero1>numero2 && numero1>numero3){
            System.out.println("O numero maior é o:"+numero1);

        }else if (numero2>numero1 && numero2>numero3){
            System.out.println("O número maior é o:"+numero2);
        }else if (numero3>numero1 && numero3>numero2) {
            System.out.println("O número maior é o:" + numero3);
        }else{
            System.out.println("");
        }
        if (numero1<numero2 && numero1<numero3){
            System.out.println("O numero menor é o:"+numero1);

        }else if (numero2<numero1 && numero2<numero3){
            System.out.println("O número menor é o:"+numero2);
        }else if (numero3<numero1 && numero3<numero2) {
            System.out.println("O número menor é o:" + numero3);
        }else{
            System.out.println("");
            }
        System.out.println("A média aritmética dos três números é:"+media);
        texto.close();

    }
}
