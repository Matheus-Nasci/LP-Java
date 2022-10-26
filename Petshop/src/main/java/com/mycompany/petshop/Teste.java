package com.mycompany.petshop;

/**
 *
 * @author matheusn
 */
public class Teste {

    public static void main(String[] args) {
        Petshop petshop = new Petshop("Lava-Rápido");
        System.out.println(petshop.toString());
        System.out.println("\n");

        Pet p1 = new Pet("Pé de pano", "pinscher");
        Pet p2 = new Pet("Bala no alvo", "buldogue");
        Pet p3 = new Pet("Bolinha", "pug");
        
        petshop.darBanho(p1, 92.1);
        petshop.darBanho(p3, 23.2);
        petshop.darBanho(p3, 40.0, 7.0);
        petshop.darBanho(p2, 81.4, 9.2);

        System.out.println(p1.toString());
        System.out.println("\n");
        System.out.println(p2.toString());
        System.out.println("\n");
        System.out.println(p3.toString());
        System.out.println("\n");
        
        System.out.println(petshop.toString());

    }
}
