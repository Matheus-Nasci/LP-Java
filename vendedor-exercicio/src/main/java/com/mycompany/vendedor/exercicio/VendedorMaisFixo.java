package com.mycompany.vendedor.exercicio;

/**
 *
 * @author mnasci
 */
public class VendedorMaisFixo extends VendedorComissao {

    private Double salarioFixo;

    public VendedorMaisFixo(Integer codigo, String nome, Double salarioFixo, Double venda, Double taxa) {
        super(codigo, nome, venda, taxa);
        this.salarioFixo = salarioFixo;
    }

    public Double calcularSalario() {
        return salarioFixo = salarioFixo + (this.getVenda() * (this.getTaxa() / 100));
    }

    public Double getSalarioFixo() {
        return salarioFixo;
    }

    public void setSalarioFixo(Double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }
}
