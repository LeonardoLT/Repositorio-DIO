import java.io.File;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class ExemploFile {
    public static void main(String[] args) {
        
        File f = new File("dica-para-ler-e-escrever-arquivo-java-io.txt");
        System.out.println("nome do arquivo: " + f.getName());
        System.out.println("caminho: " + f.getPath());
        System.out.println("caminho absoluto: " + f.getAbsolutePath());
        System.out.println("diretório pai: " + f.getParent());
        System.out.println(f.exists() ? "existe" : "não existe");
        System.out.println(f.canWrite() ? "pode ser gravado" : "não pode gravado");
        System.out.println(f.canRead() ? "pode ser lido" : "não pode ser lido");
        System.err.println(f.isDirectory() ? "é um diretório" : "não é um diretório");

        DateFormat df = new SimpleDateFormat("dd/mm/yyyy");
        Date data = new Date(f.lastModified());
        System.out.println("última modificação do arquivo: " + df.format(data));
        System.out.println("tamanho do arquivo: " + f.length() + " bytes");
    }
}
