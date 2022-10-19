
/**
 *
 * @author Matheus Nascimento
 */
public class Termometro {

    Double temperaturaAtual;
    Double temperaturaMax;
    Double temperaturaMin;

    void aumentaTemperatura(Double temp) {
        if (temperaturaAtual + temp > temperaturaMax) {
            temperaturaAtual = temperaturaMax;
        } else {
            temperaturaAtual += temp;
        }
    }

    void diminuiTemperatura(Double temp) {
        if (temperaturaAtual - temp < temperaturaMin) {
            temperaturaAtual = temperaturaMin;
        } else {
            temperaturaAtual -= temp;
        }
    }

    void exibeFahreinheit() {
        Double result = (temperaturaAtual * 1.8) + 32;
        System.out.println(result);
    }
}
