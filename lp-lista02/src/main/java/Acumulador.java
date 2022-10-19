
import java.util.Scanner;

/**
 *
 * @author Matheus Nascimento
 */
public class Acumulador {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número: ");
        Integer numeroDigitado = leitor.nextInt();
        Integer somaNum = 0;

        while (numeroDigitado != 0) {

            somaNum = numeroDigitado + somaNum;

            System.out.println("Digite outro: ");
            numeroDigitado = leitor.nextInt();
        }

        System.out.println("Total: " + somaNum);
    }
}
