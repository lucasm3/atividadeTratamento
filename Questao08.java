public class Questao08 {
    public static void main(String[] args){
        String[] lista = {"2.0", "2.1", "2.2","lucas"};

        for(String elemento : lista){
            try{
                double n = Double.parseDouble(elemento);
                System.out.println(n);
            }catch(NumberFormatException e){
                System.err.println("Erro:" + elemento);
            }
        }
    }
}
