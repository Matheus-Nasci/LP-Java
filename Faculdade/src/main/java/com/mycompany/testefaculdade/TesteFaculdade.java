package com.mycompany.testefaculdade;

/**
 *
 * @author matheusn
 */
public class TesteFaculdade {

    public static void main(String[] args) {
        Faculdade faculdade = new Faculdade("SPTech");
        
        Aluno a1 = new Aluno("0122101", "Larissa Dantas", 1);
        Aluno a2 = new Aluno("0122199", "Andrey Dantas", 2);
        Aluno a3 = new Aluno("0122132", "Thayla Dantas", 3);
        
        faculdade.matricularAluno(a1);
        faculdade.matricularAluno(a2);
        faculdade.matricularAluno(a3);
        
        faculdade.exibirAlunos();
        
//        CANCELAR ALUNO
        faculdade.cancelarMatricula("0122101");
        
        System.out.println("CANCELADOS");
        faculdade.exibirCancelados();
        
        System.out.println("ALUNOS POR SEMESTRE");
        faculdade.exibirAlunosPorSemestre(3);
        
    }
}
