
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author aluno
 */
public class Sorteio {

    public static void main(String[] args) {
        
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite um número de 1 a 100: ");
        Integer escolha = leitor.nextInt();
        
        Integer impar = 0;
        Integer par = 0;
        Integer escolhaSort = 0;

        for (int i = 0; i <= 200; i++) {
            Integer numAleatorio = ThreadLocalRandom.current().nextInt(1, 101);
            
            if (numAleatorio == escolha) {
                System.out.println(String.format("Número sorteado na %d vez", i));
                escolhaSort++;
            }
            
            if (numAleatorio % 2 == 0) {
                par++;
            } else {
                impar++;
            }
        }
        
        if (escolhaSort == 0) {
            System.out.println("O Número escolhido não foi sorteado dessa vez");
        }
        
        System.out.println(par + " Pares Sorteados");
        System.out.println(impar + " Impares Sorteados");
        
    }
}
