
/**
 *
 * @author Matheus Nascimento
 */
public class Teste {
    public static void main(String[] args) {
        
        Produto p = new Produto("Tênis", "Calçados", 230.00);
        Produto p1 = new Produto("Boné", "Acessórios", 67.99);
        Produto p2 = new Produto("Toca", "Acessórios", 23.59);
        Carrinho c = new Carrinho("Loja");
        
//      ADICIONANDO AO CARRINHO
        c.adicionar(p);
        c.adicionar(p1);
        c.adicionar(p2);
        
        System.out.println("VALOR TOTAL DOS PRODUTOS");
        System.out.println(c.getValorTotal());
        
        System.out.println("BUSCANDO PRODUTO EXISTENTE");
        System.out.println(c.existePorNome("Boné"));
        
        System.out.println("QUANTIDADE POR CATEGORIA");
        System.out.println(c.getQuantidadePorCategoria("Acessórios"));
        
        System.out.println("REMOVER POR NOME");
        System.out.println("Produto Existe:" + c.existePorNome("Toca"));
        c.removerPorNome("Toca");
        System.out.println("Produto Existe:" + c.existePorNome("Toca"));
        
        c.limpar();
        
    }
}
