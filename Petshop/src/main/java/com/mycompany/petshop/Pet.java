package com.mycompany.petshop;

/**
 *
 * @author matheusn
 */
public class Pet {

    private String nome;
    private String raca;
    private Integer qtdVisitas;
    private Double valorGasto;

    public Pet(String nome, String raca) {
        this.nome = nome;
        this.raca = raca;
        this.qtdVisitas = 0;
        this.valorGasto = 0.0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public void setQtdVisitas(Integer qtdVisitas) {
        this.qtdVisitas = qtdVisitas;
    }

    public Integer getQtdVisitas() {
        return qtdVisitas;
    }

    public Double getValorGasto() {
        return valorGasto;
    }

    

    public void setValorGasto(Double valorGasto) {
        this.valorGasto = valorGasto;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s"
                + "\nRaça: %s"
                + "\nQuantidade Visitas: %d"
                + "\nValor Gasto: R$ %.2f", nome, raca, qtdVisitas, valorGasto);
    }
}
