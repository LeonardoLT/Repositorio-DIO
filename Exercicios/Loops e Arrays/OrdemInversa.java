//import java.util.Scanner;

/*Faça um Programa que leia um vetor de 5 números inteiros e mostre-os na ordem inversa.*/

public class OrdemInversa {
    public static void main(String[] args) {
        int[] numero = {10, 56, 289, 4, 19};

        /*Scanner scan = new Scanner(System.in);
        int[] numero = new int[5];
        for(int i = 0; i < numero.length; i++){
            System.out.println("Digite um número: ");
            numero[i] = scan.nextInt();
        }*/

        System.out.print("Números na ordem inversa: ");
        for(int i = numero.length -1; i >= 0; i--){
            System.out.print(numero[i] + " ");
        }
        
        //scan.close();
    }
}
