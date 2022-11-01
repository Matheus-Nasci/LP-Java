package com.mycompany.vendedor.exercicio;

/**
 *
 * @author mnasci
 */
public class App {

    public static void main(String[] args) {
        VendedorComissao vendedor1 = new VendedorComissao(19231,"Thayla", 980.0,43.5 );
        System.out.println(vendedor1);
       
        VendedorMaisFixo vendedor2 = new VendedorMaisFixo(12983, "Matheus", 2350.0, 383.0, 17.2);
        System.out.println(vendedor2);
        
        System.out.println(String.format("Salário Vendedor:"
                + " R$ %.2f", vendedor1.calcularSalario()));
        
        System.out.println(String.format("Salário Vendedor:"
                + " R$ %.2f", vendedor2.calcularSalario()));
    }
}
