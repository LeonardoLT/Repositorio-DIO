import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Exercicio1IO {

    public static void receberTecladoImprimirConsole() throws IOException{

        /*InputStream is = System.in;
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);*/
        System.out.println("Recomende 3 filmes: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //forma resumida das três linhas acima do println
        String line = br.readLine();

        /*OutputStream os = System.out;
        OutputStreamWriter osw = new OutputStreamWriter(os);
        BufferedWriter bw = new BufferedWriter(osw);*/
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); //forma resumida das três linhas acima

        do{
            bw.write(line);
            bw.newLine();
            line = br.readLine();

        }while(!(line.isEmpty()));

        bw.flush();
        bw.close();
        br.close();

    }
    public static void main(String[] args) throws IOException {
        receberTecladoImprimirConsole();

    }
    
}
