
import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args){
        Scanner t = new Scanner(System.in);
        String text = t.nextLine();
        try{
            int num = Integer.parseInt(text);

        }catch (NumberFormatException e){
            System.err.println("Erro: A string não contem numero inteiro.");
        }

    }
}
