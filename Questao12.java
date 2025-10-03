import java.text.SimpleDateFormat;
import java.util.Date;

public class Questao12 {
    public static void main(String[] args) {
        String dataString = "32/13/2023";

        try {
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            formato.setLenient(false);
            Date data = formato.parse(dataString);
            System.out.println(data);
        } catch (Exception e) {
            System.err.println("Data inválida");
        }
    }
}