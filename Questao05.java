import java.util.Scanner;

public class Questao05 {
    public static void main(String [] args){
        Scanner a = new Scanner(System.in);
        String texto = a.nextLine();

        try{
            if (texto.equals("null")){
                texto = null;
            }
            System.out.println(texto.length());
        }catch(NullPointerException e) {
            System.err.println("Erro: String é null");
        }
    }
}