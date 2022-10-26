
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Matheus Nascimento
 */
public class Carrinho {

    private String cliente;

    private List<Produto> produtos;

    public Carrinho(String cliente) {
        this.cliente = cliente;
        this.produtos = new ArrayList<>();
    }

    public Integer getQuantidade() {
        Integer quantidade = produtos.size() - 1;
        return quantidade;
    }

    public void adicionar(Produto p) {
        produtos.add(p);
    } 

    public Boolean existePorNome(String nome) {
        //for (int i = 0; i < produtos.size(); i++) {
        //  if (produtos.get(i).getNome().equalsIgnoreCase(nome)) {
        //      return true;
        //   }
        // }
        
        //CONTAINS CONTA QUANTIDADE LISTAS IGUAL AO (String nome)
        for (Produto produtoDaVez : produtos) {
            if (produtoDaVez.getNome().equalsIgnoreCase(nome)) {
                return true;
            }
        }

        return false;
    }

    public Integer getQuantidadePorCategoria(String nome) {
        Integer qtdCategoria = 0;
        for (int i = 0; i < produtos.size(); i++) {
            if (produtos.get(i).getCategoria().equals(nome)) {
                qtdCategoria++;
            }
        }
        return qtdCategoria;
    }

    public void limpar() {
        produtos.clear();
    }

    public void removerPorNome(String nome) {
        for (int i = 0; i < produtos.size(); i++) {
            if (produtos.get(i).getNome().equals(nome)) {
                produtos.remove(i);
            }
        }
    }

    public Produto getPorNome(String nome) {
        Integer valor = 0;
        for (int i = 0; i < produtos.size(); i++) {
            if (produtos.get(i).getNome().equals(nome)) {
                valor = i;
            }
        }
        return produtos.get(valor);
    }
    
    public Double getValorTotal() {
        Double total = 0.0;
        for (int i = 0; i < produtos.size(); i++) {
            total = total + produtos.get(i).getPreco();
        }
        return total;
    }
}
