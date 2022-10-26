package com.mycompany.contacorrente;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author matheusn
 */
public class ContaCorrente {

    private String titular;
    private Double saldo;
    private List<Historico> historico;

    public ContaCorrente(String titular) {
        this.titular = titular;
        this.saldo = 0.0;
        this.historico = new ArrayList<>();
    }

    public void depositar(Double valor, Integer dia, Integer mes, Integer ano) {
        if (valor > 0) {
            historico.add(new Historico(dia, mes, ano, valor, "Depósito"));
            saldo = saldo + valor;
        }

        System.out.println("VALOR INVÁLIDO");
    }

    public void sacar(Double valor, Integer dia, Integer mes, Integer ano) {
        if (saldo > valor) {
            historico.add(new Historico(dia, mes, ano, valor, "Saque"));
            saldo = saldo - valor;
        } 
        
        System.out.println("SALDO INSUFICIENTE");
    }

    public void exibirExtrato() {
        for (int i = 0; i < historico.size(); i++) {
            System.out.println(historico.get(i));
        }
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return String.format("Titular: %s"
                + "\nSaldo: R$ %.2f\n", titular, saldo);
    }
}
