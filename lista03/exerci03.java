package lista03;

import java.util.Scanner;

public class exerci03 {
    public static void main(String[] args) {
        int a,b,c,raiz1,raiz2,delta;
        double raiz3,raiz4;
        Scanner texto= new Scanner(System.in);


        System.out.println("Seja bem vindo!");
        System.out.println("Escreva o coeficiente de A:");
        a=texto.nextInt();
        System.out.println("Escreva o coeficiente de B:");
        b=texto.nextInt();
        System.out.println("Escreva o coeficiente de C:");
        c=texto.nextInt();

        //raiz primeiro grau
        raiz1= -c/b;
        delta= (b*b)*2-4*a*c;

        if (a==0 && b==0 && c==0){
            System.out.println("Coeficiente informados incorretamente");
        } else if (a==0 && b!=0) {
            System.out.println("Essa é uma equação de primeiro grau");
            System.out.println("Valor da raiz real da equação="+raiz1);

        } else if (delta<0) {

            System.out.println("Está equação não possui raizes reais.");
            
        } else if (delta>0) {

            raiz2=-b/(2*a);
            System.out.println("Essa equação possui duas raizes iguais:"+raiz2);

        } else if (delta<0) {
            raiz3=(-b+Math.sqrt(delta))/(2*a);
            raiz4=(-b-Math.sqrt(delta))/(2*a);
            System.out.println("A equação possui duas raizes reais diferentes:"+raiz3+ "e"+raiz4);

            texto.close();

        }
    }
}
