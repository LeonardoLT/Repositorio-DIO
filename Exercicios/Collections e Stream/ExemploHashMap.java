import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ExemploHashMap {
    public static void main(String[] args) {
        
        Map<String, Integer> campeoesMundiais = new HashMap<>(); //Map é composto por uma chave e pelo valor

        //Adiciona as seleções
        campeoesMundiais.put("Brasil", 5);
        campeoesMundiais.put("Alemanha", 4);
        campeoesMundiais.put("Itália", 4);
        campeoesMundiais.put("Uruguai", 2);
        campeoesMundiais.put("Argentina", 2);
        campeoesMundiais.put("França", 2);
        campeoesMundiais.put("Inglaterra", 1);
        campeoesMundiais.put("Espanha", 1);

        System.out.println(campeoesMundiais);

        //Atualiza o valor para a chave Brasil
        campeoesMundiais.put("Brasil", 6);
        System.out.println(campeoesMundiais);

        //Retorna se existe um campeão França
        System.out.println(campeoesMundiais.containsKey("França"));

        //Remove o campeão França
        campeoesMundiais.remove("França");
        System.out.println(campeoesMundiais.containsKey("França"));

        //Retorna se existe seleção com 6 vitórias
        System.out.println(campeoesMundiais.containsValue(6));

        //Retorna o tamanho do Map
        System.out.println(campeoesMundiais.size());

        //Navega nos registros do Map
        for(Map.Entry<String, Integer> entry : campeoesMundiais.entrySet()){
            System.out.println("-> " + entry);
        }

        //Navega nos registros do Map
        for(String key : campeoesMundiais.keySet()){
            System.out.println(key + " --> " + campeoesMundiais.get(key));
        }

        //Verifica se o Map contém a chave Estados Unidos
        System.out.println(campeoesMundiais.containsKey("Estados Unidos"));

        //Verifica se o Map contém o valor 5
        System.out.println(campeoesMundiais.containsValue(5));

        //Verifica o tamanho do Map
        System.out.println(campeoesMundiais.size());

        //Limpa o Map
        campeoesMundiais.clear();
        System.out.println(campeoesMundiais.size());


    }
}
