import java.util.Scanner;

/* Faça um Programa que leia um vetor de 6 caracteres, e diga quantas consoantes foram lidas. Imprima as consoantes. */
public class Consoantes {
    public static void main(String[] args) {
        //char[] caracteres = {'A', 'k', 'l', 'u', 'g', 's'};
        Scanner scan = new Scanner(System.in);
        String[] caracteres = new String[6];
        for(int i = 0; i < 6; i++){
            System.out.println("Digite um caracter: ");
            caracteres[i] = scan.next();
        }
        int consoante = 0;

        for(String caracter : caracteres){
            if(!(caracter.equalsIgnoreCase("a") || caracter.equalsIgnoreCase("e") || caracter.equalsIgnoreCase("i")  || caracter.equalsIgnoreCase("o") || caracter.equalsIgnoreCase("u"))){
                System.out.print(caracter + " ");
                consoante++;
            }  
        }

        System.out.println("\nQuantidade de consoantes: " + consoante);
        scan.close();
    }
}
