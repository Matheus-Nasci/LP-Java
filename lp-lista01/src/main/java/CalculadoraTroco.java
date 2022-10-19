
import java.util.Scanner;

/**
 *
 * @author Matheus Nascimento
 */
public class CalculadoraTroco {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Qual o valor unitário do produto?");
        Double valorUni = leitor.nextDouble();
        
        System.out.println("Qual a quantidade vendida?");
        Double qtdVendida = leitor.nextDouble();
        
        System.out.println("Qual o valor pago?");
        Double valor = leitor.nextDouble();
        
        Double compra = valorUni * qtdVendida;
        Double troco = valor - compra;
        
        if (valor < compra) {
            System.out.println("Saldo insuficiente para realizar a compra");
        } else {
            System.out.println("Seu troco será de R$ " + troco);
        }
    }
}
