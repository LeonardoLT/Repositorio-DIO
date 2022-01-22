import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class ExemploHashSet {
    public static void main(String[] args) {
        
        Set<Double> notas = new HashSet<>(); //instancia o Set

        //LinkedHashSet<Double> notas = new LinkedHashSet<>(); //Mantém a ordem de inserção, o tornando mais lento que o Set


        //Set não se preocupa com a ordem de inserção e não permite elementos repetidos
        //Adiciona as notas no Set
        notas.add(9.2);
        notas.add(4.5);
        notas.add(8.3);
        notas.add(5.1);
        notas.add(7.6);
        notas.add(3.0);
        notas.add(9.2);
        notas.add(8.5);
        notas.add(8.1);
        notas.add(10.0);

        System.out.println(notas);

        //Remove uma nota do Set
        notas.remove(3.0);
        System.out.println(notas);

        //Retorna a quantidade de itens no Set
        System.out.println(notas.size());

        //Navega em todos os itens do iterator
        Iterator<Double> iterator = notas.iterator();
        while(iterator.hasNext()){
            System.out.println("--> " + iterator.next());
        }

        //Navega pelos itens usando foreach
        for(Double nota : notas){
            System.out.println("---> " + nota);
        }

        //Retorna se o Set está vazio
        System.out.println(notas.isEmpty());

        //Limpa o Set
        notas.clear();
        System.out.println(notas.isEmpty());
    }
    
}
