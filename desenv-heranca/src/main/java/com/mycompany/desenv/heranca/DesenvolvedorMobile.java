package com.mycompany.desenv.heranca;

/**
 *
 * @author mnasci
 */
public class DesenvolvedorMobile extends Desenvolvedor {
    private Integer qtdHoraTrabalhadaMobile;
    private Double valorHoraTrabalhadaMobile;
    public Double getSalario(){
        return qtdHoraTrabalhadaMobile * valorHoraTrabalhadaMobile;
    }

    public DesenvolvedorMobile(String nome) {
        super(nome);
        this.qtdHoraTrabalhadaMobile = 0;
        this.valorHoraTrabalhadaMobile = 57.0;
    }
    
    public void trabalhar(Integer hora, Double valor) {
        
    }
}