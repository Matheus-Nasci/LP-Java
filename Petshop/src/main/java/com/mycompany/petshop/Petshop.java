package com.mycompany.petshop;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author matheusn
 */
public class Petshop {

    private String nome;
    private Double faturamento;
    private List<Pet> pets;

    public Petshop(String nome) {
        this.nome = nome;
        this.faturamento = 0.0;
        this.pets = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getFaturamento() {
        return faturamento;
    }

    public void setFaturamento(Double faturamento) {
        this.faturamento = faturamento;
    }

    public void darBanho(Pet p, Double valor) {
        if (pets.contains(p)) {
            pets.add(p);
        } else {
            p.setValorGasto(p.getValorGasto() + valor);
            p.setQtdVisitas(p.getQtdVisitas() + 1);
            faturamento = faturamento + valor;
        }
    }

    public void darBanho(Pet p, Double valor, Double desconto) {
        
        if (pets.contains(p)) {
            pets.add(p);
        } else {
            p.setValorGasto(p.getValorGasto() + (valor - desconto));
            faturamento = faturamento + (valor - desconto);
            p.setQtdVisitas(p.getQtdVisitas() + 1);
        }
    }

    @Override
    public String toString() {
        return String.format("\nNome: %s"
                + "\nFaturamento: R$ %.2f", nome, faturamento);
    }

}
