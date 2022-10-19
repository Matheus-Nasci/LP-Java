
import java.util.Scanner;

/**
 *
 * @author Matheus Nascimento
 */
public class TesteIdade {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        ClassificaIdade c = new ClassificaIdade();
        
        System.out.println("Qual sua idade: ");
        Integer valor = leitor.nextInt();
        
        c.classificacao(valor);
    }
}
