package com.mycompany.contacorrente;

/**
 *
 * @author matheusn
 */
public class ContaCorrente {
    private String titular;
    private Double saldo;

    public ContaCorrente(String titular) {
        this.titular = titular;
        this.saldo = 0.0;
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
        return String.format(titular, args)
    }   
}
