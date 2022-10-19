
/**
 *
 * @author Matheus Nascimento
 */
public class TesteEmpregado {

    public static void main(String[] args) {
        Empregado empregado = new Empregado();

        empregado.nome = "João";
        empregado.cargo = "Analista de Sistemas";
        empregado.salario = 5400.0;

        empregado.reajustarSalario(0.15);

        System.out.println(String.format("Olá %s, O cargo de %s "
                + "agora ganha R$%.2f", empregado.nome,
                empregado.cargo, empregado.salario));
    }
}
