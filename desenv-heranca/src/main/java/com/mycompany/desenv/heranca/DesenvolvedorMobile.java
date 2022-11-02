package com.mycompany.desenv.heranca;

/**
 *
 * @author mnasci
 */
public class DesenvolvedorMobile extends Desenvolvedor {
    private Integer qtdHoraTrabalhadaMobile;
    private Double valorHoraTrabalhadaMobile;

    public DesenvolvedorMobile(String nome, Integer qtdHorasTrabalhadas, 
            Double valorHoraTrabalhada, Integer qtdHoraTrabalhadaMobile, 
            Double valorHoraTrabalhadaMobile) {
        super(nome, qtdHorasTrabalhadas, valorHoraTrabalhada);
        this.qtdHoraTrabalhadaMobile = qtdHoraTrabalhadaMobile;
        this.valorHoraTrabalhadaMobile = valorHoraTrabalhadaMobile;
    }
    
    public Double getSalario(){
        return qtdHoraTrabalhadaMobile * valorHoraTrabalhadaMobile;
    }
}
