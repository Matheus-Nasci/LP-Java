
import java.util.Scanner;

/**
 *
 * @author Matheus Nascimento
 */
public class CadastroUsuario {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Login: ");
        String login = leitor.next();

        System.out.println("Senha: ");
        String senha = leitor.next();

        System.out.println("Qual a quantidade de vezes que você aceita "
                + "errar antes de ser bloqueado? ");
        String qtdErro = leitor.next();

        System.out.println("Seu login é " + login + " e sua"
        + " senha é" + senha + ". Você tem " + qtdErro + " tentativas antes "
        + "de ser bloqueado");

    }
}
