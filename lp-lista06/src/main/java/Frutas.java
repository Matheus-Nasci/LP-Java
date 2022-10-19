
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Matheus Nascimento
 */
public class Frutas {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        List ListaFrutas = new ArrayList();

        System.out.println("Qual frutas você deseja encontrar? ");
        String escolha = leitor.next();

        ListaFrutas.add("ABACAXI");
        ListaFrutas.add("BANANA");
        ListaFrutas.add("MAÇA");
        ListaFrutas.add("UVA");
        ListaFrutas.add("MANGA");
        ListaFrutas.add("MORANGO");
        ListaFrutas.add("CEREJA");
        ListaFrutas.add("MELANCIA");

        Boolean existeFruta = false;

        for (int i = 0; i < ListaFrutas.size(); i++) {
            var fruta = ListaFrutas.get(i);
            String palavra = escolha.toUpperCase();

            if (palavra.equals(fruta)) {
                existeFruta = true;
            }
        }

        if (existeFruta) {
            System.out.println(String.format("A fruta %s existe na lista", escolha));
        } else {
            System.out.println(String.format("Não existe a fruta %s na lista", escolha));
        }
    }
}
