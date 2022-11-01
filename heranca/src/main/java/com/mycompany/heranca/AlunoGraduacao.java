package com.mycompany.heranca;

/**
 *
 * @author mnasci
 */
public class AlunoGraduacao extends Aluno {

    private Double notaIntegrada;
    private Double notaContinuada;

    public AlunoGraduacao(String ra, String nome, Double nota1, Double nota2, 
            Double notaIntegrada, Double notaContinuada) {
        super(ra, nome, nota1, nota2);
        this.notaIntegrada = notaIntegrada;
        this.notaContinuada = notaContinuada;
    }

    @Override
    public Double calcularMedia() {
        return (this.getNota2() + this.getNota2() + notaIntegrada + notaContinuada);
    }
    
    
    public Double getNotaIntegrada() {
        return notaIntegrada;
    }

    public void setNotaIntegrada(Double notaIntegrada) {
        this.notaIntegrada = notaIntegrada;
    }

    public Double getNotaContinuada() {
        return notaContinuada;
    }

    public void setNotaContinuada(Double notaContinuada) {
        this.notaContinuada = notaContinuada;
    }

}
