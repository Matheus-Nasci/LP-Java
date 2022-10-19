
import java.util.Scanner;

/**
 *
 * @author Matheus Nascimento
 */
public class Idade {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o seu nome:");
        String nome = leitor.nextLine();
        
        System.out.println("Olá, " + nome + "! Qual o ano de seu nascimento?");
        Integer ano = leitor.nextInt();
        
        Integer idade = 2030 - ano;
        
        System.out.println("Em 2030 você terá " + idade + " anos");
    }
}
