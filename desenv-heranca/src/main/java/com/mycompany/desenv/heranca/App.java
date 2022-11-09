package com.mycompany.desenv.heranca;

/**
 *
 * @author mnasci
 */
public class App {

    public static void main(String[] args) {
        Desenvolvedor dev = new Desenvolvedor("Matheus");
        System.out.println(dev);
        System.out.println(String.format("Você ganha: R$ %.2f por dia", dev.getSalario()));
        
        DesenvolvedorMobile dev2 = new DesenvolvedorMobile("Samuel");
        System.out.println(String.format("Você ganha: R$ %.2f por dia", dev2.getSalario()));
        
        Consultoria consul = new Consultoria("Safra", 20);  
    }
}
