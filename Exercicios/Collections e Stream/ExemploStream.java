import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ExemploStream {
    public static void main(String[] args) {
        
        List<String> estudantes = new ArrayList<>();

        //Adiciona estudantes
        estudantes.add("Leonardo");
        estudantes.add("Lara");
        estudantes.add("Sophia");
        estudantes.add("Renato");
        estudantes.add("Pedro");
        estudantes.add("Clara");
        estudantes.add("Humberto");
        estudantes.add("Alice");

        //Retorna a contagem de elementos na Stream
        System.out.println("Contagem " + estudantes.stream().count());

        //Retorna o elemento com o maior número de letras
        System.out.println("Maior quantidade de letras: " + estudantes.stream().max(Comparator.comparingInt(String::length)));

        //Retorna o elemento com o menor número de letras
        System.out.println("Menor quantidade de letras: " + estudantes.stream().min(Comparator.comparingInt(String::length)));

        //Retorna os elementos que tenham R no nome
        System.out.println("Nomes com R: " + estudantes.stream().filter((estudante) -> 
            estudante.toLowerCase().contains("r")).collect(Collectors.toList()));

        //Retorna uma nova coleção com os nomes concatenados ao número de letras
        System.out.println("Nova coleção com a quantidade de letras: " + estudantes.stream().map(estudante ->
            estudante.concat(" - ").concat(String.valueOf(estudante.length()))).collect(Collectors.toList()));

        //Retorna somente os 3 primeiros elementos
        System.out.println("Os 3 primeiros elementos: " + estudantes.stream().limit(3).collect(Collectors.toList()));

        //Exibe os elementos no console e retorna a mesma coleção
        System.out.println("Retorna os elementos: " + estudantes.stream().peek(System.out::println).collect(Collectors.toList()));

        //Exibe os elementos no console sem retornar outra coleção
        System.out.println("Retorna os elementos novamente: ");
        estudantes.stream().forEach(System.out::println);

        //Retorna true se todos os elementos tiverem a letra W
        System.out.println("Todos tem W? - " + estudantes.stream().allMatch((elemento) -> elemento.toLowerCase().contains("W")));

        //Retorna true se tiver algum elemento com um 'u' minúsculo
        System.out.println("Tem u minúsculo? - " + estudantes.stream().anyMatch((elemento) -> elemento.contains("u")));

        //Retorna true se nenhum elemento tiver a letra 'a' minúscula
        System.out.println("Não tem nenhum a minúsculo? - " + estudantes.stream().noneMatch((elemento) -> elemento.contains("a")));

        //Retorna o primeiro elemento da coleção e se existir exibe no console
        System.out.println("Retorna o primeiro elemento da coleção: ");
        estudantes.stream().findFirst().ifPresent(System.out::println);

        //Operação encadeada
        System.out.println("Exemplo de operação encadeada:");
        System.out.println(estudantes.stream()
            .peek(System.out::println)
            .map(estudante ->
                estudante.concat(" - ").concat(String.valueOf(estudante.length())))
            .peek(System.out::println)
            .filter((estudante) ->
                    estudante.toLowerCase().contains("r"))
            .collect(Collectors.toList()));

    }
}
