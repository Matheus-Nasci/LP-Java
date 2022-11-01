package com.mycompany.vendedor.exercicio;

/**
 *
 * @author mnasci
 */
public class VendedorComissao {

    private Integer codigo;
    private String nome;
    private Double venda;
    private Double taxa;

    public VendedorComissao(Integer codigo, String nome, Double venda, Double taxa) {
        this.codigo = codigo;
        this.nome = nome;
        this.venda = venda;
        this.taxa = taxa;
    }

    public Double calcularSalario() {
        return venda * (taxa / 100);
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getVenda() {
        return venda;
    }

    public void setVenda(Double venda) {
        this.venda = venda;
    }

    public Double getTaxa() {
        return taxa;
    }

    public void setTaxa(Double taxa) {
        this.taxa = taxa;
    }

    @Override
    public String toString() {
        return String.format("Código: %s\nNome: %s\nVendas: "
                + "R$ %.2f\nTaxa: %.1f", this.codigo, this.nome, this.venda, this.taxa);
    }

}
