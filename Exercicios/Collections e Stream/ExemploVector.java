import java.util.List;
import java.util.Vector;

public class ExemploVector {
    public static void main(String[] args) {
        
        List<String> esportes = new Vector<>();

        esportes.add("Futebol");
        esportes.add("Basquetebol");
        esportes.add("Tenis de mesa");
        esportes.add("Handebol");

        System.out.println(esportes);

        //Altera o valor da posição 2 do vetor
        esportes.set(2, "Ping Pong");

        //remove o esporte da posição 2
        esportes.remove(2);

        //remove o esporte Handebol do vetor
        esportes.remove("Handebol");

        //retorna o primeiro item do vetor
        System.out.println(esportes.get(0));

        //Navega nos esportes
        for(String esporte : esportes){
            System.out.println("--> " + esporte);
        }

    }
}
