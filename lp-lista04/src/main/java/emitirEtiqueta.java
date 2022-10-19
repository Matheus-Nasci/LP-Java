
/**
 *
 * @author Matheus Nascimento
 */
public class emitirEtiqueta {
    public static void main(String[] args) {
        Encomenda encomenda = new Encomenda();
        
        encomenda.valorEncomenda = 20.0;
        encomenda.tamanho = "P";
        encomenda.distancia = 53;
        encomenda.enderecoRemetente = "Avenida Juquitiba, 3892";
        encomenda.enderecoDestinatario = "Rua Professor Fernandes, 3892";
        
        encomenda.emitirEtiqueta();
    }
}
