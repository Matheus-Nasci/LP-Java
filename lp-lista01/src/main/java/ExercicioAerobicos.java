
import java.util.Scanner;

/**
 *
 * @author Matheus Nascimento
 */
public class ExercicioAerobicos {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Quanto tempo você passou aquecendo? (Em minutos)");
        Integer tempAquec = leitor.nextInt();

        System.out.println("Quanto tempo você passou fazendo fez exercícios "
                + "aeróbicos? (Em minutos)");
        Integer tempAero = leitor.nextInt();

        System.out.println("Quanto tempo você passou fazendo musculação? "
                + "(Em minutos)");
        Integer tempMusc = leitor.nextInt();
        
        Integer totalMin = tempAquec + tempAero + tempMusc;
        
        Integer perdaAquec = tempAquec * 12;
        Integer perdaAero = tempAero * 20;
        Integer perdaMusc = tempMusc * 25;
        
        Integer totalPerda = perdaAquec + perdaAero + perdaMusc;
        
        System.out.println("Olá, Jorge. Você fez um total de " + totalMin + " minutos de exercícios e perdeu cerca de " + totalPerda + " calorias");
        
        

    }
}
