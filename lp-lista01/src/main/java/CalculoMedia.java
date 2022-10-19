
import java.util.Scanner;


/**
 *
 * @author Matheus Nascimento
 */
public class CalculoMedia {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Qual seu nome?");
        String nome = leitor.nextLine();
        
        System.out.println("Qual foi sua 1° nota?");
        Double nota1 = leitor.nextDouble();
        
        System.out.println("Qual foi sua 2° nota?");
        Double nota2 = leitor.nextDouble();
        
        Double media = (nota1 + nota2) / 2;
        
        System.out.println("Olá, " + nome + ". Sua média foi de " + media);
    }
}
