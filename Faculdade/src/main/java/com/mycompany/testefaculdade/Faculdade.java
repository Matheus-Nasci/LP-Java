package com.mycompany.testefaculdade;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author matheusn
 */
public class Faculdade {

    private String nome;
    private List<Aluno> alunos;

    public Faculdade(String nome) {
        this.nome = nome;
        this.alunos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }
    
    public void matricularAluno(Aluno aluno){
        alunos.add(aluno);
    }
    
    public void cancelarMatricula(String ra){
        for(Aluno a: alunos){
            if(a.getRa().equals(ra)){
                a.setAtivo(false);
            }
        }
    }
    
    public void exibirAlunos(){
        for(int i = 0; i < alunos.size(); i++){
            System.out.println(alunos.get(i).toString());
        }
    }
    
    public void exibirAlunosPorSemestre(Integer semestre){
        for(Aluno a: alunos){
            if(a.getSemestre().equals(semestre)){
                System.out.println(a.toString());
            }
        }
    }
    
    public void exibirCancelados(){
        for(int i = 0; i < alunos.size(); i++){
            if(alunos.get(i).getAtivo() == false){
                System.out.println(alunos.get(i).toString());
            }
        }
    }
}
