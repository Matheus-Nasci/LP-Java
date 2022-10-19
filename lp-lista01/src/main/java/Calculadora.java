
import java.util.Scanner;


/**
 *
 * @author Matheus Nascimento
 */
public class Calculadora {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite um número:");
        Integer num1 = leitor.nextInt();
        
        System.out.println("Digite outro número:");
        Integer num2 = leitor.nextInt();
        
        Integer soma = num1 + num2;
        Integer sub = num1 - num2;
        Integer mult = num1 * num2;
        Integer div = num1 / num2;
        
        System.out.println("Resultado da soma: " + soma);
        System.out.println("Resultado da subtração: " + sub);
        System.out.println("Resultado da multiplicação: " + mult);
        System.out.println("Resultado da divisão: " + div);
    }
}
