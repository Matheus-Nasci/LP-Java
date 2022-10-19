
import java.util.Scanner;

/**
 *
 * @author Matheus Nascimento
 */
public class TesteVerificarPrimo {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        VerificarPrimo verf = new VerificarPrimo();

        System.out.println("Digite um número: ");
        Double valor = leitor.nextDouble();
        
        if (valor < 0) {
            System.out.println("");
        } else {
            
            Integer result = verf.calcular(valor);
            if (result == 2) {
                System.out.println("Número primo com " + result + " divisores");
            } else {
                System.out.println("Número não é primo " + result + " divisores");
            }
        }
    }
}
