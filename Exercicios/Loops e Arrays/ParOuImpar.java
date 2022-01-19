import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int quantidadeNumeros = 0, numero = 0, ePar = 0, eImpar = 0;
        int count = 0;

        System.out.print("Digite quantos números você quer analisar: ");
        quantidadeNumeros = scan.nextInt();

        do{
            System.out.print("Digite um número: ");
            numero = scan.nextInt();

            if(numero %2 == 0)
                ePar++;
            else
                eImpar++;

            count++;

        }while(count < quantidadeNumeros);

        System.out.println("Pares: " + ePar);
        System.out.println("Ímpares: " + eImpar);
        scan.close();
    }
}
