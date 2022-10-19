
import java.util.Scanner;

/**
 *
 * @author Matheus Nascimento
 */
public class Beneficio {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Quantos filhos de 0 a 3 anos você possui?");
        Integer filhos0a3 = leitor.nextInt();

        System.out.println("Quantos filhos de 4 a 16 anos você possui?");
        Integer filhos4a16 = leitor.nextInt();

        System.out.println("Quantos filhos de 17 a 18 anos você possui?");
        Integer filhos17a18 = leitor.nextInt();
        
        Integer qtdFilhos = filhos0a3 + filhos4a16 + filhos17a18;
        
        Double filhoBebe = filhos0a3 * 25.12;
        Double filhoCrian = filhos4a16 * 15.88 ;
        Double filhoAdole = filhos17a18 * 12.44;
        
        Double qtdBeneficio = filhoBebe + filhoCrian + filhoAdole;
        
        System.out.println("Você tem um total de " + qtdFilhos + " filhos e "
        + "vai receber R$ " + qtdBeneficio + " de bolsa");
        
        
    }
}
