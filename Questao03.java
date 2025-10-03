import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args){
        Scanner n = new Scanner(System.in);
        String[] arr = {"zero", "um", "dois"};
        int indice = n.nextInt();

        try{
            System.out.println(arr[indice]);

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Erro: indice fora do tamanho da lista.");
        }
    }
}
