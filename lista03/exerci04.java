package lista03;
import java.util.Scanner;
public class exerci04 {
    public static void main(String[] args) {
        Scanner texto= new Scanner (System.in);
        double raio;

        System.out.print("Seja bem vindo");
        System.out.print("digite aqui o raio do circulo:");
        raio=texto.nextDouble();

        //PERIMETRO DO CIRCULO
        double perimetro= 2*3.141592*raio;

        //ÁREA DO CIRCULO
        double acirculo= 3.141592*(raio*raio);

        //VOLUME DA ESFERA
        double vesfera= 4/3*((3.141592)*(raio*raio*raio));

        //OPERAÇÃO
        int operacao;
        System.out.println("Abaixo, digite o numero da operação desejada");
        System.out.println("1-Perimetro\n2-Área\n3-Volume");
        operacao=texto.nextInt();

        switch (operacao){
            case 1:
                System.out.println("Perimetro do circulo= "+perimetro);
                break;
            case 2:
                System.out.println("Área do circulo= "+acirculo);
                break;
            case 3:
                System.out.println("Volume da esfera= "+vesfera);
                break;


        }

        texto.close();




    }

}
