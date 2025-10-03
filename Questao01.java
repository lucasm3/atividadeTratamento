import java.util.InputMismatchException;
import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) {

        try {
            Scanner n = new Scanner(System.in);
            int a = n.nextInt();
            int b = n.nextInt();

            int resultado = a / b;
            System.out.println(resultado);

        }catch (ArithmeticException e) {
            System.err.println("Erro: não pode dividir inteiro por zero");

        }catch (InputMismatchException e) {
            System.err.println("Erro: apenas valores inteiros");

        }


    }

}