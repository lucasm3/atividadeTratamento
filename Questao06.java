public class Questao06 {
    public static void main(String[] args){
        String[] l = {"lucas", null, "moreira", null};

        for (int i = 0; i < l.length; i++){
            try{
                System.out.println(l[i].toUpperCase());
            }catch(NullPointerException e){
                System.err.println("null");
            }
        }
    }
}
