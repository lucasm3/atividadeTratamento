import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Questao04 {
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        String nomePasta = a.nextLine();

        try{
            String cont = Files.readString(Paths.get(nomePasta));
            System.out.println(cont);
        }catch(Exception e){
            System.err.println("Erro: Pasta não encontrada");
        }
    }
}