package com.mycompany.lista05;

/**
 *
 * @author Matheus Nascimento
 */
public class Colaborador {

    private String nome = "";
    private String cargo = "";
    private Double salario = 0.0;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double novoSalario) {
        salario = novoSalario;
    }
}
