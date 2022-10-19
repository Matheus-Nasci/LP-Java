package com.mycompany.lista05;

/**
 *
 * @author Matheus Nascimento
 */
public class TesteColaborador {

    public static void main(String[] args) {
        Colaborador colab01 = new Colaborador();
        Colaborador colab02 = new Colaborador();
        RecursosHumanos rh = new RecursosHumanos();

        colab01.setNome("Magal");
        colab01.setCargo("Analista");
        colab01.setSalario(3250.0);

        colab02.setNome("Samuel");
        colab02.setCargo("Desenvolvedor Flutter");
        colab02.setSalario(2890.0);

        System.out.println("Colaborador 1");
        System.out.println("Nome: " + colab01.getNome());
        System.out.println("Cargo: " + colab01.getCargo());
        System.out.println("Salário: " + colab01.getSalario());
        System.out.println("\n");

        System.out.println("Colaborador 2");
        System.out.println("Nome: " + colab02.getNome());
        System.out.println("Cargo: " + colab02.getCargo());
        System.out.println("Salário: " + colab02.getSalario());
        System.out.println("\n");

        System.out.println("REAJUSTE SALÁRIO DO(A) " + colab01.getNome());
        rh.reajustarSalario(1300.0, colab01);
        System.out.println("Salário: " + colab01.getSalario());
        System.out.println("\n\n");

        System.out.println("PROMOÇÃO DO(A) " + colab02.getNome());
        rh.promoverColaborador("Gestor TI Cartões", 7450.0, colab02);
        System.out.println("\n");

        System.out.println("Colaborador 2");
        System.out.println("Nome: " + colab02.getNome());
        System.out.println("Cargo: " + colab02.getCargo());
        System.out.println("Salário: " + colab02.getSalario());
        System.out.println("\n");

        System.out.println("PROMOÇÃO DO(A) " + colab02.getNome());
        rh.promoverColaborador("Analista Junior", 3843.0, colab02);
        System.out.println("\n");

        System.out.println("Total Colaboradores Promovidos:");
        System.out.println(rh.getTotalDePromovidos());

        System.out.println("Total Salários reajustados:");
        System.out.println(rh.getTotalSalReajustado());
        System.out.println("\n");

        System.out.println("Colaborador 1");
        System.out.println("Nome: " + colab01.getNome());
        System.out.println("Cargo: " + colab01.getCargo());
        System.out.println("Salário: " + colab01.getSalario());
        System.out.println("\n");

        System.out.println("Colaborador 2");
        System.out.println("Nome: " + colab02.getNome());
        System.out.println("Cargo: " + colab02.getCargo());
        System.out.println("Salário: " + colab02.getSalario());
        System.out.println("\n");

    }
}
