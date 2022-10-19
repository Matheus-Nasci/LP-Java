
import java.util.Scanner;


/**
 *
 * @author Nascimento
 */
public class TesteMedia {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        CalcularMedia calc = new CalcularMedia();
        
        System.out.println("----- MÉDIA -----");
        System.out.println("Digite a primeira nota: ");
        Double valor1 = leitor.nextDouble();
        System.out.println("Digite a segunda nota: ");
        Double valor2 = leitor.nextDouble();
        
        Double resultado = calc.calcularMedia(valor1, valor2);
        
        System.out.println(String.format("Resultado: %.2f", resultado));
    }
}
