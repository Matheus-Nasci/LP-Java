package com.mycompany.heranca;

/**
 *
 * @author mnasci
 */
public class App {

    public static void main(String[] args) {

        Aluno aluno = new Aluno("01203192", "Andrey", 7.5, 9.5);
        AlunoGraduacao alunoGraduacao = new AlunoGraduacao("557323", "Thayla", 
                10.0, 9.0, 7.6, 7.6);

        System.out.println(aluno);
        System.out.println(alunoGraduacao);
        System.out.println(String.format("A média do %s é: %.1f", aluno.getNome(), aluno.calcularMedia()));
        System.out.println(String.format("A média do %s é: %.1f", alunoGraduacao.getNome(), alunoGraduacao.calcularMedia()));
    }
}
