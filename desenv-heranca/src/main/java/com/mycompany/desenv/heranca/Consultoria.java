package com.mycompany.desenv.heranca;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mnasci
 */
public class Consultoria {

    private String nome;
    private Integer vagas;
    private List<Desenvolvedor> desenvolvedor;

    public Consultoria(String nome, Integer vagas) {
        this.nome = nome;
        this.vagas = vagas;
        this.desenvolvedor = new ArrayList();
    }

    public Boolean exibirPorNome(String nome) {
        for (int i = 0; i < desenvolvedor.size(); i++) {
            if (desenvolvedor.get(i).getNome().equals(nome)) {
                return true;
            }
        }
        return false;
    }

    public void contrar(Desenvolvedor d) {
        if (vagas > 0) {
            desenvolvedor.add(d);
        } else {
            System.out.println("Sem vagas disponíveis!");
        }
    }

    public Integer getQuantidadeDesenvolvedores() {
        Integer qtdDev = 0;
        for (Desenvolvedor d : desenvolvedor) {
            if (d instanceof Desenvolvedor) {
                qtdDev++;
            }
        }
        return qtdDev;
    }

    public Integer getQuantidadeDesenvolvedoresMobile() {
        Integer qtdDev = 0;
        for (Desenvolvedor d : desenvolvedor) {
            if (d instanceof DesenvolvedorMobile) {
                qtdDev++;
            }
        }
        return qtdDev;
    }

    public Double getTotalSalario() {
        Double totalSalario = 0.0;
        for (Desenvolvedor d : desenvolvedor) {
            totalSalario += d.getSalario();
        }
        return totalSalario;
    }

    public Desenvolvedor buscarDesenvolvedorPorNome(String nome) {
        for (Desenvolvedor d : desenvolvedor) {
            if (d.getNome().equals(nome)) {
                return d;
            }
        }
        System.out.println("Ninguém com esse nome");
        return null;
    }
}
