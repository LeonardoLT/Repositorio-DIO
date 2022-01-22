import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExercicioSet {

    static void exercicioTreeSet(){

        System.out.println("------------------TreeSet-------------------------");
        TreeSet<Integer> numeros = new TreeSet<>();

        numeros.add(3);
        numeros.add(88);
        numeros.add(20);
        numeros.add(44);
        numeros.add(3);

        for(int numero : numeros){
            System.out.println("-> " + numero);
        }

        //Remova o primeiro item do Set
        numeros.pollFirst();
        System.out.println(numeros);

        //Adicione um número novo no Set
        numeros.add(23);
        System.out.println(numeros);

        //Verifique o tamanho do Set
        System.out.println(numeros.size());

        //Verifique se está vazio
        System.out.println(numeros.isEmpty());

    }
    public static void main(String[] args) {
        
        Set<Integer> numeros = new HashSet<>();

        //LinkedHashSet<Integer> numeros = new LinkedHashSet<>();

        //Adicione 5 números
        numeros.add(3);
        numeros.add(88);
        numeros.add(20);
        numeros.add(44);
        numeros.add(3);

        //Navegue pelo Set exibindo cada elemento

        for(int numero : numeros){
            System.out.println("-> " + numero);
        }

        //Remova o primeiro item do Set
        numeros.remove(3);

        //Adicione um número novo no Set
        numeros.add(23);
        System.out.println(numeros);

        //Verifique o tamanho do Set
        System.out.println(numeros.size());

        //Verifique se está vazio
        System.out.println(numeros.isEmpty());

        exercicioTreeSet();

    }
    
}
