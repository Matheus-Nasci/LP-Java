
import java.util.Scanner;

/**
 *
 * @author Matheus Nascimento
 */
public class AutenticacaoUsuario {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Usuário: ");
        String user = leitor.next();

        System.out.println("Senha: ");
        String pass = leitor.next();

        while (!user.equals("admin") ||! pass.equals("#Bandtec")) {
            System.out.println("Login e/ou senha inválidos");
            System.out.println("Tente novamente.");

            System.out.println("Usuário: ");
            user = leitor.next();

            System.out.println("Senha: ");
            pass = leitor.next();

        }
        System.out.println("Login realizado com sucesso");

    }
}
