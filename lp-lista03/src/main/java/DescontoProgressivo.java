
/**
 *
 * @author Matheus Nascimento
 */
public class DescontoProgressivo {
    Double descontar(Double valor){
        return valor - (valor * 0.10);
    }
    
    Double descontarDois(Double valor){
        return (valor - (valor * 0.20)) * 2;
    }
    
    Double descontarTres(Double valor){
        return (valor - (valor * 0.30)) * 3;
    }
}
