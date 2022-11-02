package com.mycompany.desenv.heranca;

/**
 *
 * @author mnasci
 */
public class App {

    public static void main(String[] args) {
        Desenvolvedor dev = new Desenvolvedor("Matheus",8,57.50);
        System.out.println(dev);
        System.out.println(String.format("Você ganha: R$ %.2f por dia", dev.getSalario()));
        
        DesenvolvedorMobile devmob = new DesenvolvedorMobile("Samuel",0,0.0, 7, 95.23);
        System.out.println(String.format("Você ganha: R$ %.2f por dia", devmob.getSalario()));
        
    }
}
