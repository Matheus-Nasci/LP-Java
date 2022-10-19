
/**
 *
 * @author Matheus Nascimento
 */
public class ClassificaIdade {
    void classificacao(Integer valor){
        if(valor >= 0 && valor <=2){
            System.out.println("Bebê");
        } else if(valor >= 3 && valor <= 11){
            System.out.println("Criança");
        } else if(valor >= 12 && valor <= 19){
            System.out.println("Adolescente");
        } else if(valor >= 20 && valor <= 30){
            System.out.println("Jovem");
        } else if(valor >= 31 && valor <= 60){
            System.out.println("Adulto");
        } else {
            System.out.println("Idoso");
        }
    }
}
