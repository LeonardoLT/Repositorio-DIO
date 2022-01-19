import java.util.Random;

/*Faça um Programa que leia 20 números inteiros aleatórios (entre 0 e 100) armazene-os num vetor.
Ao final, mostre os números e seus sucessores.*/

public class NumeroAleatorio {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] numeros = new int[20];

        for(int i = 0; i < numeros.length; i++){
            numeros[i] = rand.nextInt(101); //Determina que o valor aleatório não passa de 100
        }

        for(int numero : numeros){
            System.out.print(numero + " e " + (numero + 1) + ", ");
        }
    }
}
