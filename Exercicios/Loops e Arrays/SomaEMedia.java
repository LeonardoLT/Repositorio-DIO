import java.util.Scanner;

public class SomaEMedia {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int numero = 0, maior = 0, soma = 0;
        int count = 0;

        do{
            System.out.println("Digite um número: ");
            numero = scan.nextInt();
            if(numero > maior)
                maior = numero;

            soma += numero;
            count++;

        }while(count < 5);

        System.out.println("maior número: " + maior);
        System.out.println("Soma: " + soma);
        scan.close();
    }
}
