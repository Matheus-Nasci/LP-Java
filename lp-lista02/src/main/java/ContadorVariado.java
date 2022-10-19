
import java.util.Scanner;

/**
 *
 * @author Matheus Nascimento
 */
public class ContadorVariado {

    public static void main(String[] args) {
        
        Double numVar = 0.0;
        
        for (int i = 0; i < 5; i++) {
            numVar = numVar + 0.15;
            System.out.println(String.format("%.2f" , numVar));
        }
    }
}
