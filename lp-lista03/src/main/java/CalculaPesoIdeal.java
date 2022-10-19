
/**
 *
 * @author Matheus Nascimento
 */
public class CalculaPesoIdeal {
    Double calcularMulher(Double peso, Double altura){
        return (peso * altura) - 44.7;
    }
    
    Double calcularHomem(Double peso, Double altura){
        return (peso * altura) - 58;
    }
}
