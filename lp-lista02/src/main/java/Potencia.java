
import java.util.Scanner;

/**
 *
 * @author Matheus Nascimento
 */
public class Potencia {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o valor da base: ");
        Integer base = leitor.nextInt();

        System.out.println("Digite o valor do expoente: ");
        Integer expo = leitor.nextInt();

        Integer result = 0;

        for (int i = 1; i < expo; i++) {
            Integer baseFixa = base;
            
            if (i == 1) {
                result = result + (base * baseFixa); 
            } else {
                result = result * baseFixa;
            } 
        }
        
        System.out.println("Resultado: " + result);
    }
}
