import java.util.Objects;
import java.util.Scanner;

public class VerificaNome {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String nome = null;
        int idade;

        while(true){
            System.out.print("Digite o nome do aluno: ");
            nome = in.next();
            if(nome.equals("0")) break;
            System.out.print("Digite a idade do aluno: ");
            idade = in.nextInt();
        }
        in.close();
    }
}
