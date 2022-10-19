
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Matheus Nascimento
 */
public class Inteiro {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        List<Integer> listaInteiros = new ArrayList();
        List<Integer> listaImpar = new ArrayList();
        List<Integer> listaPar = new ArrayList();

        System.out.println("Para encerrar digite 0");
        System.out.println("Digite o número que você deseja adicionar a lista: ");
        Integer num = leitor.nextInt();
        listaInteiros.add(num);
        System.out.println(listaInteiros);

        while (num != 0) {
            System.out.println("Digite o número que você deseja adicionar a lista: ");
            num = leitor.nextInt();
            listaInteiros.add(num);
        }

        for (int i = 0; i < listaInteiros.size(); i++) {
            Integer numero = listaInteiros.get(i);
            if (numero == 0) {
                listaInteiros.remove(numero);
            } else if (numero % 2 == 0) {
                listaPar.add(numero);
            } else {
                listaImpar.add(numero);
            }
        }

        System.out.println("Lista: " + listaInteiros);
        System.out.println("Lista Impar: " + listaImpar);
        System.out.println("Lista Par: " + listaPar);
    }
}
