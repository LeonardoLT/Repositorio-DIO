import java.util.LinkedList;
import java.util.Queue;

public class ExercicioLinkedList {
    public static void main(String[] args) {
        
        Queue<String> nomes = new LinkedList<>();

        //Adicione 5 nomes
        nomes.add("Juliana");
        nomes.add("Pedro");
        nomes.add("Carlos");
        nomes.add("Larissa");
        nomes.add("João");

        //Navegue na fila mostrando cada nome no console
        for(String nome: nomes){
            System.out.println("--> " + nome);
        }

        //Retorne o primeiro item da fila, sem removê-lo
        System.out.println(nomes.peek());
        System.out.println(nomes);

        //Retorne o primeiro item da fila, removendo-o
        System.out.println(nomes.poll());
        System.out.println(nomes);

        //Adicione um novo nome: Daniel. Verifique a posição que o mesmo assumiu na fila
        nomes.add("Daniel");
        System.out.println(nomes);

        //Retorne o tamanho da fila
        System.out.println(nomes.size());

        //Verifique se a lista está vazia
        System.out.println(nomes.isEmpty());

        //Verifique se o noomes Carlos está na lista
        System.out.println(nomes.contains("Carlos"));
    }
    
}
