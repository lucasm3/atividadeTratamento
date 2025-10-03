import java.nio.file.Files;
import java.nio.file.Paths;

public class Questao09 {
    public static void main(String[] args){
        try{
            Files.copy(Paths.get("origem.txt"), Paths.get("destino.txt"));
            System.out.println("Cópia concluída");
        }catch (Exception e){
            System.err.println("Erro na cópia");
        }
    }
}
