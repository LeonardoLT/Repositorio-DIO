import java.util.Random;

/* Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-9.
Após isso determine o menor número da matriz e a sua posição(linha, coluna).*/

public class Multidimensional {
    public static void main(String[] args) {
        Random rand = new Random();
        int [][] matriz = new int[4][4];
        int menor = 10, posL = 0, posC = 0;

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = rand.nextInt(10);
                //System.out.print(matriz[i][j] + " ");
                if(menor > matriz[i][j]){
                    menor = matriz[i][j];
                    posL = i;
                    posC = j;
                }
            }
            //System.out.print("\n");
        }

        for(int[] linha : matriz){
            for(int coluna : linha){
                System.out.print(coluna + " ");
            }
            System.out.print("\n");
        }
        System.out.println(menor + " é o menor número da matriz, na posição [" + posL + ", " + posC + "]");
    }
    
}
