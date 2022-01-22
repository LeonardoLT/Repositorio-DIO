import java.util.Iterator;
import java.util.TreeSet;

public class ExemploTreeSet {
    public static void main(String[] args) {
        
        TreeSet<String> treeCapitais = new TreeSet<>(); //Leitura rápida mas ordenação demorada

        //Monta a árvore com as capitais
        treeCapitais.add("Porto Alegre");
        treeCapitais.add("Florianópolis");
        treeCapitais.add("Curitiba");
        treeCapitais.add("São Paulo");
        treeCapitais.add("Rio de Janeiro");
        treeCapitais.add("Belo Horizionte");

        System.out.println(treeCapitais);

        //Retorna a primeira capital do topo da árvore
        System.out.println(treeCapitais.first());

        //Retorna a última capital do final da árvore
        System.out.println(treeCapitais.last());

        //Retorna a primeira capital abaixo na árvore da capital parametrizada
        System.out.println("lower: " + treeCapitais.lower("Florianópolis"));

        //Retorna a primeira capital acima na árvore da capital parametrizada
        System.out.println(treeCapitais.higher("Florianópolis"));

        //Exibe todas as capitais
        System.err.println(treeCapitais);

        //Navega pelos itens com iterator
        Iterator<String> iterator = treeCapitais.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //com foreach
        for(String capital : treeCapitais){
            System.out.println("--> " + capital);
        }
    }
    
}
