package br.dev.joaquim.webservice.services;

import java.util.*;

import br.dev.joaquim.webservice.entities.Curso;

public class CursosManager {
    private List<Curso> cursos;
    private int codigoCount;

    public CursosManager() {
        this.cursos = new ArrayList<>();
        this.cursos.add(new Curso(++codigoCount,"Sistemas de Informação", 3000));
        this.cursos.add(new Curso(++codigoCount,"Ciência da Computção", 3000));
    }

    public List<Curso> getCursos() {
        return this.cursos;
    }

    public Curso add(Curso curso) {
        curso.setCodigo(++codigoCount);
        this.cursos.add(curso);
        return curso;
    }

    public Curso getByCodigo(int codigo) {
        for(Curso c: this.cursos) {
            if(c.getCodigo() == codigo) return c;
        }
        return null;
    }

    public void remove(int codigo) {
        Curso aRemover = getByCodigo(codigo);
        if(aRemover == null) return;
        this.cursos.remove(aRemover);
    }

    // public void update(int codigo, Curso curso) {
    //     remove(codigo);
    //     curso.setCodigo(codigo);
    //     this.cursos.add(curso);
    // }

    public void update(int codigo, Curso curso) {
        Curso antigo = getByCodigo(codigo);
        antigo.setDuracao(curso.getDuracao());
        antigo.setNome(curso.getNome());
    }
}