
import java.util.Scanner;

/**
 *
 * @author Matheus Nascimento
 */
public class Pesquisa {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        
        Integer mussa = 0;
        Integer calab = 0;
        Integer queijo = 0;
        
        for (int i = 1; i <= 10; i++) {
            System.out.println("Mussarela - 5\n Calabresa - 25\n 4 Queijos - 50\n");
            System.out.println("Voto Aluno " + i);
            System.out.println("Qual sabor de pizza favorito: ");
            Integer voto = leitor.nextInt();
            
            switch(voto){
                case 5: 
                    mussa++;
                    break;
                case 25:
                    calab++;
                    break;
                case 50:
                    queijo++;
                    break;
                default:
                    System.out.println("Número Inválido, digite novamente: ");
                    voto = leitor.nextInt();
                    break;
            }
        }
        
        System.out.println("Votos Mussarela: " + mussa);
        System.out.println("Votos Calabresa: " + calab);
        System.out.println("Votos 4 Queijos: " + queijo);
        
       if(mussa > calab && mussa > queijo ){
            System.out.println("Mussarela pizza favorita"); 
       } else if(calab > queijo && calab > mussa){
            System.out.println("Calabresa pizza favorita"); 
       } else {
           System.out.println("4 Queijo pizza favorita"); 
       }
        
    }
}
