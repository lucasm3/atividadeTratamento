import java.util.*;

public class Questao11 {
    public static void main(String[] args) {
        List<String> lista = Arrays.asList("10", "20", "abc", "30");

        try {
            double soma = 0;
            int count = 0;

            for (String elemento : lista) {
                try {
                    soma += Double.parseDouble(elemento);
                    count++;
                } catch (NumberFormatException e) {
                    System.out.println("Valor inválido: " + elemento);
                }
            }

            if (count == 0) throw new ArithmeticException();
            System.out.println(soma / count);

        } catch (ArithmeticException e) {
            System.out.println("Lista vazia");
        }
    }
}