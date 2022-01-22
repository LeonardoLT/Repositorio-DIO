import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class ExemploTreeMap {
    public static void main(String[] args) {
        
        TreeMap<String, String> treeCapitais = new TreeMap<>();

        //Monta a árvore
        treeCapitais.put("RS", "Porto Alegre");
        treeCapitais.put("SC", "Florianópolis");
        treeCapitais.put("PR", "Curitiba");
        treeCapitais.put("SP", "São Paulo");
        treeCapitais.put("RJ", "Rio de Janeiro");
        treeCapitais.put("BH", "Belo Horizionte");

        System.out.println(treeCapitais);

        //Retorna a primeira capital
        System.out.println(treeCapitais.firstKey());

        //Retorna a última capital
        System.out.println(treeCapitais.lastKey());

        //Retorna a primeira capital
        System.out.println(treeCapitais.firstEntry().getKey() + " - " + treeCapitais.firstEntry().getValue());

        //Retorna a última capital
        System.out.println(treeCapitais.lastEntry().getKey() + " - " + treeCapitais.lastEntry().getValue());

        //Retorna a capital abaixo da capital parametrizada
        System.out.println(treeCapitais.lowerKey("RJ"));

        //Retorna a capital acima da capital parametrizada
        System.out.println(treeCapitais.higherKey("RJ"));

        //Retorna a capital abaixo da capital parametrizada
        System.out.println(treeCapitais.lowerEntry("RJ").getKey() + " - " + treeCapitais.lowerEntry("RJ").getValue());

        //Retorna a capital acima da capital parametrizada
        System.out.println(treeCapitais.higherEntry("RJ").getKey() + " - " + treeCapitais.higherEntry("RJ").getValue());

        Map.Entry<String, String> firstEntry = treeCapitais.pollFirstEntry();
        Map.Entry<String, String> lastEntry = treeCapitais.pollLastEntry();

        //Retorna a primeira capital, removendo-a do Map
        System.out.println(treeCapitais.firstEntry().getKey() + " - " + firstEntry.getValue());

        //Retorna a última capital, removendo-a do Map
        System.out.println(treeCapitais.lastEntry().getKey() + " - " + lastEntry.getValue());

        System.out.println(treeCapitais);

        //Navega em todas as chaves
        Iterator<String> iterator = treeCapitais.keySet().iterator();

        while(iterator.hasNext()){
            String key = iterator.next();
            System.out.println(key + " - " + treeCapitais.get(key));
        }

        for(String capital : treeCapitais.keySet()){
            System.out.println(capital + " - " + treeCapitais.get(capital));
        }

        for(Map.Entry<String, String> capital : treeCapitais.entrySet()){
            System.out.println(capital.getKey() + " - " + capital.getValue());
        }


    }
    
}
