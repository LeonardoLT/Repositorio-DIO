import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {
    public static void main(String[] args) {
        
        List<String> nomes = new ArrayList<>(); //declara uma lista

        nomes.add("Leonardo");
        nomes.add("Maria");
        nomes.add("Carlos");
        nomes.add("Monique");
        nomes.add("Ariel");

        System.out.println(nomes);
        nomes.set(2, "Larissa"); //substitui um item da lista. (índice, novoConteudo)
        System.out.println(nomes);
        Collections.sort(nomes); //coloca a lista em ordem alfabética
        System.out.println(nomes);
        nomes.remove(4);         //remove por índice
        System.out.println(nomes); 
        nomes.remove("Larissa"); //remove por objeto
        System.out.println(nomes);
        System.out.println(nomes.indexOf("Leonardo")); //pega o índice do elemento passado. Retorna -1 se não encontrar
        System.out.println(nomes.get(1)); //pega um elemento pelo índice
        System.out.println(nomes.size()); //retorna o tamanho da list. .size() é pra list, .lenght() é pra vetor
        boolean temMaria = nomes.contains("Maria"); // verifica se o elemento passado existe
        System.out.println(temMaria);
        System.out.println(nomes.isEmpty()); //verifica se a list está vazia


        for(String nomeDoItem : nomes){
            System.out.println(nomeDoItem);
        }

        Iterator<String> iterator = nomes.iterator();

        while(iterator.hasNext()){                  //.hasNext() retorna true sempre que houver algum elemento no próximo índice
            System.out.println(iterator.next());    //.next() retorna o elemento
        }


        nomes.clear();
        System.out.println(nomes.isEmpty());
        
    }
}
