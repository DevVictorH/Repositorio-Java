package curso.poo.composicao;

import java.util.ArrayList;

public class Aluno {

    String nome;
    final ArrayList<Curso> cursos = new ArrayList<>();

    Aluno(String nome){
        this.nome = nome;
    }

    void adcionarCurso(Curso curso){
        this.cursos.add(curso);
        curso.alunos.add(this);
    }

    Curso getCurso(String nome){

        for(Curso curso: this.cursos){
            if(curso.nome.equalsIgnoreCase(nome)){
                return curso;
            }
        }

        return null;
    }

    public String toString(){
        return nome;
    }

}
