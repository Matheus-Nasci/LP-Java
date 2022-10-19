package com.sptech.atividade.com.testes;

/**
 *
 * @author Matheus Nascimento
 */
public class Hospital {

    private String nome;
    private Integer quantidadeDePagamentos;
    private Integer quantidadeDeHoraExtra;

    public void realizarPagamento(Medico medico, Double valorPago) {
        if (medico != null && valorPago != null) {
            if (medico.getAtivo() && valorPago > 0) {

            }
        }
    }

    public void realizarPagamento(Medico medico, Double valorPago, Double horaExtra) {
        if (medico != null && valorPago != null) {
            if (medico.getAtivo() && valorPago > 0 && horaExtra != null && horaExtra > 0) {

            }
        }
    }

    public void desligarMedico(Medico medico) {
        if (medico != null && medico.getAtivo()) {
            
        }
    }

    public Hospital(String nome) {
        this.nome = nome;
        this.quantidadeDePagamentos = 0;
        this.quantidadeDeHoraExtra = 0;
    }

    public String getNome() {
        return nome;
    }

    public Integer getQuantidadeDePagamentos() {
        return quantidadeDePagamentos;
    }

    public Integer getQuantidadeDeHoraExtra() {
        return quantidadeDeHoraExtra;
    }
}
