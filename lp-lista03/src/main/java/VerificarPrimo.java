
/**
 *
 * @author Matheus Nascimento
 */
public class VerificarPrimo {

    Integer calcular(Double num) {

        Integer div = 0;
        Integer naoDiv = 0;

        for (int i = 1; i <= num; i++) {
            Double result = num % i;

            if (result == 0) {
                div++;
            } else {
                naoDiv++;
            }
        }

        return div;
    }
}
