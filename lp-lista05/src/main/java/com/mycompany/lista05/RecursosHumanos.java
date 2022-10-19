package com.mycompany.lista05;

/**
 *
 * @author Matheus Nascimento
 */
public class RecursosHumanos {

    private Integer totalDePromovidos = 0;
    private Integer totalSalReajustado = 0;

    public void reajustarSalario(Double valorReajuste, Colaborador colaborador) {
        if (valorReajuste > 0) {
            colaborador.setSalario(colaborador.getSalario() + valorReajuste);
            totalSalReajustado++;
        } else {
            System.out.println("Valor de Reajuste inválido");
        }
    }

    public void promoverColaborador(String novoCargo, Double novoSal, Colaborador colaborador) {
        if (novoSal > colaborador.getSalario()) {
            colaborador.setCargo(novoCargo);
            colaborador.setSalario(novoSal);
            totalDePromovidos++;
        } else {
            System.out.println("Não foi permitido a promoção com um salário Inferior");
        }
    }

    public Integer getTotalDePromovidos() {
        return totalDePromovidos;
    }

    public Integer getTotalSalReajustado() {
        return totalSalReajustado;
    }
}
