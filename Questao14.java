public class Questao14 {
    public static void main(String[] args) {
        String hex = "1A3FG";

        try {
            int numero = Integer.parseInt(hex, 16);
            System.out.println(numero);
        } catch (NumberFormatException e) {
            System.out.println("Hexadecimal inválido");
        }
    }
}