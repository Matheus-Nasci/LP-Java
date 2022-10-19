
import java.util.Scanner;

/**
 *
 * @author Matheus Nascimento
 */
public class TesteClassesSociais {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        ClassesSociais clas = new ClassesSociais();
        
        System.out.println("Qual valor da sua renda: ");
        Double salario = leitor.nextDouble();
        
        String classe = "";
        
        if(salario <= 2090){
            classe = "E";
        } else if(salario >= 2090.0 && salario <= 4180.0){
            classe = "D";
        } else if(salario >= 4180.01 && salario <= 10450.0){
            classe = "C";
        } else if(salario >= 10450.1 && salario <= 20900.0){    
            classe = "B";
        } else if(salario >= 20900.1){
            classe = "A";
        }
        
        System.out.println(String.format("Você recebe aproximadamente %.1f salários mínimos", clas.calcularSalMin(salario)));
        System.out.println("Você pertence a classe social: " + classe);
    }
}
