package com.mycompany.contacorrente;

/**
 *
 * @author matheusn
 */
public class Teste {

    public static void main(String[] args) {
        ContaCorrente c1 = new ContaCorrente("Joseph Paul");
        
        c1.depositar(2930.0, 25, 10, 2022);
        c1.depositar(130.0, 25, 10, 2022);
        c1.depositar(98.0, 25, 10, 2022);
        c1.sacar(1560.0, 1, 02, 2023);
        
        c1.exibirExtrato();
        System.out.println(c1.toString());
        
    }
}
