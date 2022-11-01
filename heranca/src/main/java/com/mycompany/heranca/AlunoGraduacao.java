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
        return (this.getNota1() + this.getNota2() + notaIntegrada + notaContinuada) / 4;
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

    @Override
    public String toString() {
        return String.format("RA: %s\nNome: %s\nNota 1: %.1f\nNota 2:"
                + " %.1f\nNota Integrada: %.1f\nNota Continuada: %.1f", 
                this.getRa(), this.getNome(), this.getNota1(), 
                this.getNota2(), this.notaIntegrada, this.notaContinuada);
    }
    
    
}
