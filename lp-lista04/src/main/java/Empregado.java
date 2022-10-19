
/**
 *
 * @author Matheus Nascimento
 */
public class Empregado {

    String nome;
    String cargo;
    Double salario;

    void reajustarSalario(Double porcentagem) {
        Double result = salario * porcentagem;
        
        salario += result;
    }
}
