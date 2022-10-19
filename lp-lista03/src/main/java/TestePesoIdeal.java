
import java.util.Scanner;

/**
 *
 * @author Matheus Nascimento
 */
public class TestePesoIdeal {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        CalculaPesoIdeal p = new CalculaPesoIdeal();

        System.out.println("Escolha o Sexo (F)Feminino ou (M)Masculino\n");
        System.out.println("Digite: ");
        String sexo = leitor.next();

        while (!sexo.equals("F") && !sexo.equals("M")) {
            System.out.println("Valor incorreto, digite novamente: ");
            sexo = leitor.next();
        }

        if (sexo.equals("F")) {
            System.out.println("Qual seu peso: ");
            Double peso = leitor.nextDouble();
            System.out.println("Qual sua altura: ");
            Double altura = leitor.nextDouble();
            Double resultado = p.calcularMulher(peso, altura);
            System.out.println(String.format("O peso ideal é %.2f", resultado));
        } else {
            System.out.println("Qual seu peso: ");
            Double peso = leitor.nextDouble();
            System.out.println("Qual sua altura: ");
            Double altura = leitor.nextDouble();
            Double resultado = p.calcularHomem(peso, altura);
            System.out.println(String.format("O peso ideal é %.2f", resultado));
        }
    }
}
