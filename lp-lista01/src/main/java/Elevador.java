
import java.util.Scanner;

/**
 *
 * @author Matheus Nascimento
 */
public class Elevador {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Qual o limite de peso de um elevador?");
        Double pesoElev = leitor.nextDouble();
        
        System.out.println("Qual o limite de pessoas?");
        Integer qtdPess = leitor.nextInt();
        
        System.out.println("Qual peso da 1ª pessoa que entrou no elevador?");
        Double p1 = leitor.nextDouble();
        
        System.out.println("Qual peso da 2ª pessoa que entrou no elevador?");
        Double p2 = leitor.nextDouble();
        
        System.out.println("Qual peso da 3ª pessoa que entrou no elevador?");
        Double p3 = leitor.nextDouble();
        
        Double pesoTotal = p1 + p2 + p3;
        System.out.println("Entraram 3 pessoas no elevador, no qual "
                + "cabem " + qtdPess + "pessoas. \n O peso total no elevador é "
                    + "de " + pesoTotal + ", sendo que ele suporta " + pesoElev);
    }
}
