
/**
 *
 * @author Matheus Nascimento
 */
public class App {

    public static void main(String[] args) {
        Bolo bolo1 = new Bolo();
        Bolo bolo2 = new Bolo();
        Bolo bolo3 = new Bolo();

        bolo1.sabor = "Chocolate";
        bolo1.valor = 23.0;
        bolo1.quantidadeVendida = 0;

        bolo2.sabor = "Ninho";
        bolo2.valor = 14.0;
        bolo2.quantidadeVendida = 0;

        bolo3.sabor = "Morango";
        bolo3.valor = 113.0;
        bolo3.quantidadeVendida = 0;
        
        System.out.println("Bolo 1");
        bolo1.comprarBolo(61);
        bolo1.comprarBolo(51);
        bolo1.exibirRelatorio();
        
        System.out.println("Bolo 2");
        bolo2.comprarBolo(2);
        bolo2.exibirRelatorio();
    }
}
