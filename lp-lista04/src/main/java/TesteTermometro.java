
/**
 *
 * @author Matheus Nascimento
 */
public class TesteTermometro {

    public static void main(String[] args) {
        
        Termometro termometro = new Termometro();
        
        termometro.temperaturaAtual = 21.0;
        termometro.temperaturaMax = 47.2;
        termometro.temperaturaMin = 12.0;
        
        System.out.println("Temperatura Atual - Aumentar:");
        termometro.aumentaTemperatura(20.0);
        System.out.println(termometro.temperaturaAtual);
        System.out.println("Temperatura Diminuir - Aumentar:");
        termometro.diminuiTemperatura(31.2);
        System.out.println(termometro.temperaturaAtual);
        
        System.out.println("Fahreinheit:");
        termometro.exibeFahreinheit();
    }
}
