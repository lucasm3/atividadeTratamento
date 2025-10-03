import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        while(true){
            String a = s.nextLine();
            if (a.equals("sair"))
                break;

            try{
                int n = Integer.parseInt(a);
                System.out.println(n);
            }catch (NumberFormatException e){
                System.err.println("Não é um número");
            }
        }
    }
}
