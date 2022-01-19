import java.util.Scanner;
public class VerificaValor {
    public static void main(String[] args) {
        
        System.out.println("Insira uma nota entre 0 e 10");
        Scanner in = new Scanner(System.in);
        int numero = in.nextInt();

        while(numero < 0 || numero > 10){
            System.out.println("Nota inválido. Digite novamente.");
            numero = in.nextInt();
        }
        in.close();
    }
}
