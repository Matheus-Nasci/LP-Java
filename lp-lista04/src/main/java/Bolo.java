
/**
 *
 * @author Matheus Nascimento
 */
public class Bolo {

    String sabor;
    Double valor;
    Integer quantidadeVendida;

    void comprarBolo(Integer qtdBolo) {
        if ((quantidadeVendida + qtdBolo) > 100) {
            System.out.println("Seu pedido ultrapassou nosso"
                    + " limite diário para esse bolo.");
        } else {
            quantidadeVendida += qtdBolo;
            System.out.println("Compra realizada!");
        }
    }

    void exibirRelatorio() {
        System.out.println(String.format("O bolo sabor %s, foi "
                + "comprado %d vezes hoje, totalizando "
                + "R$%.2f", sabor, quantidadeVendida, valor * quantidadeVendida));
    }
}
