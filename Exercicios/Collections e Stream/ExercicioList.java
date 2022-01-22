import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExercicioList {
    public static void main(String[] args) {
        
        List<String> nomes = new ArrayList<>();

        //Adicione 5 nomes
        nomes.add("Juliana");
        nomes.add("Pedro");
        nomes.add("Carlos");
        nomes.add("Larissa");
        nomes.add("João");

        //Navegue na lista exibindo cada nome
        for(String nome : nomes){
            System.out.println("--> " + nome);
        }

        //Substitua o nome Carlos por Roberto
        nomes.set(2, "Roberto");
        System.out.println(nomes);

        //Retorne o nome da posição 1
        System.out.println(nomes.get(1));

        //Remova o nome da posição 4
        nomes.remove(4);

        //Remova o nome João
        nomes.remove("João");

        //Retorne a quantidade de itens na lista
        System.out.println(nomes.size());

        //Verifique se o nome Juliano existe na lista
        System.out.println(nomes.contains("Juliano"));

        /*Crie uam nova lista com os nomes Ismael e Rodrigo.
        Adicione todos os itens da nova lista na primeira lista criada */

        List<String> novosNomes = new ArrayList<>();
        novosNomes.add("Ismael");
        novosNomes.add("Rodrigo");

        nomes.addAll(novosNomes);
        System.out.println(nomes);

        //Ordene os itens da lista em ordem alfabética
        Collections.sort(nomes);
        System.out.println(nomes);

        //Verifique se a lista está vazia
        System.err.println(nomes.isEmpty());
    }
}
