
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Matheus Nascimento
 */
public class SalLiquido {

    public static void main(String[] args) {
        
        DecimalFormat df = new DecimalFormat("#,###.00");
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite seu salário bruto:");
        Double salBruto = leitor.nextDouble();
        
        System.out.println("Quanto custa a condução diária só de ida da "
                + "casa para o trabalho?");
        Double valeTrans = leitor.nextDouble();
        
        System.out.println("Quantas vezes você usou o VT este mês?");
        Integer qtdUso = leitor.nextInt();
        
        Double vt = valeTrans * qtdUso;
        Double descINSS = salBruto * 0.10;
        Double descIR = salBruto * 0.20;
        Double salLiquido = salBruto - descINSS - descIR - vt;
        Double desconto = vt + descINSS + descIR;

        System.out.println("Seu salário bruto é R$ " + df.format(salBruto) + 
        ", tem um total de R$ " + df.format(desconto) + " em descontos e "
        + "receberá um líquido de R$ " + df.format(salLiquido));
                
        
    }
}
