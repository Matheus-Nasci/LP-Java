
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Matheus Nascimento
 */
public class Loteria {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        Integer acerto = 0;

        for (int i = 0; i <= 10; i++) {

            Integer Aleat = ThreadLocalRandom.current().nextInt(1, 11);

            System.out.println("Digite um número entre 0 e 10: ");
            Integer num = leitor.nextInt();

            System.out.println(String.format("Número sorteado: %d", Aleat));

            if (num == Aleat) {
                System.out.println("Você acertou!");
                acerto++;
            } else {
                System.out.println("Você errou.");
            }
        }

        if (acerto == 0) {
            System.out.println("Muito ruim");
        } else if (acerto <= 3) {
            System.out.println("Você é MUITO sortudo");
        } else if (acerto >= 4 || acerto < 9) {
            System.out.println("Você é sortudo");
        } else {
            System.out.println("É melhor você parar de apostar e ir trabalhar");
        }

    }
}
