import java.nio.file.*;

public class Questao13 {
    public static void main(String[] args) {
        String diretorio = "./teste";

        try {
            Files.list(Paths.get(diretorio))
                    .forEach(System.out::println);
        } catch (Exception e) {
            System.out.println("Diretório inválido");
        }
    }
}