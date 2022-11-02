package com.mycompany.desenv.heranca;

/**
 *
 * @author mnasci
 */
public class Desenvolvedor {
    protected String nome;
    protected Integer qtdHorasTrabalhadas;
    protected Double valorHoraTrabalhada;

    public Desenvolvedor(String nome, Integer qtdHorasTrabalhadas, Double valorHoraTrabalhada) {
        this.nome = nome;
        this.qtdHorasTrabalhadas = qtdHorasTrabalhadas;
        this.valorHoraTrabalhada = valorHoraTrabalhada;
    }
    
    public Double getSalario(){
        return qtdHorasTrabalhadas * valorHoraTrabalhada;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQtdHorasTrabalhadas() {
        return qtdHorasTrabalhadas;
    }

    public void setQtdHorasTrabalhadas(Integer qtdHorasTrabalhadas) {
        this.qtdHorasTrabalhadas = qtdHorasTrabalhadas;
    }

    public Double getValorHoraTrabalhada() {
        return valorHoraTrabalhada;
    }

    public void setValorHoraTrabalhada(Double valorHoraTrabalhada) {
        this.valorHoraTrabalhada = valorHoraTrabalhada;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s\nHoras Trabalhadas:"
                + " %d\nValor Hora: %s", this.nome, this.qtdHorasTrabalhadas,this.valorHoraTrabalhada);
    }
    
    
}
