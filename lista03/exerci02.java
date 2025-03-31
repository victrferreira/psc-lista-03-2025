package lista03;

import java.util.Scanner;

public class exerci02 {
    public static void main(String[] args) {
     Scanner texto=new Scanner(System.in);
     //variáveis
     double valorpago, valordecompra, resultado;

        System.out.println("Seja bem vindo!");

        //valor pago e valor de compra
        System.out.println("Escreva aqui o valor de compra:R$");
        valordecompra=texto.nextDouble();
        System.out.println("Escreva aqui o valor pago:R$");
        valorpago=texto.nextDouble();

        //Troco
        resultado=valorpago-valordecompra;


        //informações do pagamento
        if (valorpago<valordecompra){
            System.out.println("Quantia paga insuficiente");
            
        } else if (valorpago==valordecompra) {
            System.out.println("Compra efetuada com sucesso");
            
        } else if (valorpago>valordecompra) {
            System.out.println("Troco=R$"+resultado);


        }
        int[] notas = {50, 20, 10, 5, 2, 1};
        System.out.println("Troco em notas:");
        for (int nota : notas) {
            int quantidadeNotas = (int) (resultado / nota); // Número de notas dessa denominação
            if (quantidadeNotas > 0) {
                System.out.printf("%d nota(s) de R$ %d,00\n", quantidadeNotas, nota);
                resultado -= quantidadeNotas * nota;// Atualiza o valor do troco

                texto.close();

            }
        }

    }
}

