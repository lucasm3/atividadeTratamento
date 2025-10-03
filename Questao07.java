import java.util.Scanner;

public class Questao07 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        try{
            double n1 = s.nextDouble();
            String op = s.nextLine();
            double n2 = s.nextDouble();

            switch (op){
                case "+": System.out.println(n1 + n2);
                    break;
                case "-": System.out.println(n1 - n2);
                    break;
                case "*": System.out.println(n1 * n2);
                    break;
                case "/": System.out.println(n1 / n2);
                    break;
                default: System.err.println("Operação inválida");
            }
        }catch(Exception e) {
            System.err.println("Erro: Entrada inválida");
        }
    }
}
