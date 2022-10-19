
/**
 *
 * @author Matheus Nascimento
 */
public class Encomenda {

    String tamanho;
    String enderecoRemetente;
    String enderecoDestinatario;
    Integer distancia;
    Double valorEncomenda;
    Double valorFrete;

    void calcularFrete() {
        if (tamanho.equals("P")) {
            valorFrete = valorEncomenda + (valorEncomenda * 0.01);
            if (distancia <= 50) {
                valorEncomenda += valorEncomenda + 3;
            } else if (distancia >= 51 && distancia <= 200) {
                valorEncomenda += valorEncomenda + 5;
            } else {
                valorEncomenda += valorEncomenda + 7;
            }

        } else if (tamanho.equals("M")) {
            valorEncomenda += valorEncomenda * 0.03;
            if (distancia <= 50) {
                valorEncomenda += valorEncomenda + 3;
            } else if (distancia >= 51 && distancia <= 200) {
                valorEncomenda += valorEncomenda + 5;
            } else {
                valorEncomenda += valorEncomenda + 7;
            }
        } else if (tamanho.equals("G")) {
            valorEncomenda += valorEncomenda * 0.05;
            if (distancia <= 50) {
                valorEncomenda += valorEncomenda + 3;
            } else if (distancia >= 51 && distancia <= 200) {
                valorEncomenda += valorEncomenda + 5;
            } else {
                valorEncomenda += valorEncomenda + 7;
            }
        }

    }

    void emitirEtiqueta() {
        System.out.println("***** ETIQUETA PARA ENVIO *****");
        System.out.println("Endereço do remetente: " + enderecoRemetente);
        System.out.println("Endereço do destinatário: " + enderecoDestinatario);
        System.out.println("Tamanho: " + tamanho);
        System.out.println("--------------------------------------------------");
        System.out.println("Valor encomenda: R$ " + valorEncomenda);
        System.out.println("Valor frete: R$ " + valorFrete);
        System.out.println("Valor total: R$ ");
        System.out.println("--------------------------------------------------");

    }
}
