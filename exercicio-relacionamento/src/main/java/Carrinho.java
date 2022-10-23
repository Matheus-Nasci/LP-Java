
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Matheus Nascimento
 */
public class Carrinho {

    private String cliente;

    private List<Produto> produto;

    public Carrinho(String cliente) {
        this.cliente = cliente;
        this.produto = new ArrayList<>();
    }

    public Integer getQuantidade() {
        Integer quantidade = produto.size() - 1;
        return quantidade;
    }

    public void adicionar(Produto p) {
        produto.add(p);
    } 

    public Boolean existePorNome(String nome) {
        Boolean existe = false;
        for (int i = 0; i < produto.size(); i++) {
            
//         NÃO CONSEGUI FAZER USANDO CONTAINS
           if(produto.get(i).getNome().equals(nome)){
               existe = true;
           }
        }
        return existe;
    }

    public Integer getQuantidadePorCategoria(String nome) {
        Integer qtdCategoria = 0;
        for (int i = 0; i < produto.size(); i++) {
            if (produto.get(i).getCategoria().equals(nome)) {
                qtdCategoria++;
            }
        }
        return qtdCategoria;
    }

    public void limpar() {
        produto.clear();
    }

    public void removerPorNome(String nome) {
        for (int i = 0; i < produto.size(); i++) {
            if (produto.get(i).getNome().equals(nome)) {
                produto.remove(i);
            }
        }
    }

    public Produto getPorNome(String nome) {
        Integer valor = 0;
        for (int i = 0; i < produto.size(); i++) {
            if (produto.get(i).getNome().equals(nome)) {
                valor = i;
            }
        }
        return produto.get(valor);
    }
    
    public Double getValorTotal() {
        Double total = 0.0;
        for (int i = 0; i < produto.size(); i++) {
            total = total + produto.get(i).getPreco();
        }
        return total;
    }
}
