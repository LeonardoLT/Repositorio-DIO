import java.util.Scanner;

public class Fatorial {

    static void calcularFatorial(int numero){
        for(int i = numero-1; i >= 1; i--){
            numero *= i;
        }
        System.out.println(numero);
    }
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o número: ");
        int numero = scan.nextInt();
        System.out.print(numero + "!= ");
        calcularFatorial(numero);
        scan.close();
    }
}
