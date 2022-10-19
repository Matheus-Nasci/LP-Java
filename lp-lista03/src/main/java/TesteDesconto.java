
import java.util.Scanner;


/**
 *
 * @author Matheus Nascimento
 */
public class TesteDesconto {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        DescontoProgressivo desc = new DescontoProgressivo();
        
        System.out.println("Digite o valor unitário do produto: ");
        Double valorProd = leitor.nextDouble();
        
        System.out.println("Digite a quantidade: ");
        Integer qtdProd = leitor.nextInt();
        
        System.out.println("-----------------------------------");
        System.out.println(String.format("Valor do Produto: R$%.2f", valorProd));
        System.out.println(String.format("Quantidade: %d", qtdProd));
        System.out.println("-----------------------------------");
        
        if(qtdProd == 1){
            Double resultado = desc.descontar(valorProd);
            System.out.println(String.format("Valor com desconto: R$%.2f", resultado));
        } else if(qtdProd == 2){
            Double resultado = desc.descontarDois(valorProd);
            System.out.println(String.format("Valor com desconto: R$%.2f", resultado));
        } else{
            Double resultado = desc.descontarTres(valorProd);
            System.out.println(String.format("Valor com desconto: R$%.2f", resultado));
        }
        
        

    }
}
