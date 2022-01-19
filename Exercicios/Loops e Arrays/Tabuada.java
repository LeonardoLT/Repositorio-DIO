import java.util.Scanner;

public class Tabuada {

    static void calcularTabuada (int numero){
        int resultado;
        System.out.println( "Tabuada de " + numero + ":");
        for(int i = 1; i <= 10; i++){
            resultado = numero*i;
            System.out.println( numero + " X " +  i + " = " + resultado);
        }
    }
    
    public static void main(String[] args) {

        System.out.println("Insira uma tabuada entre 1 e 10");
        Scanner in = new Scanner(System.in);
        int numero = in.nextInt();
        in.close();

        if(numero >= 1 && numero <= 10)
            calcularTabuada(numero);
        else
            System.out.println("Número inválido");
        
    }
}

