
import java.util.Scanner;

/**
 *
 * @author Matheus Nascimento
 */
public class Tabuada {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Qual número da tábuada? ");
        Integer numero = leitor.nextInt();
        
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + numero * i);
        }
        
        //Dava pra fazer com for, mas eu só pensei nisso depois que já tinha 
        //feito dessa forma.
        
    }
}
