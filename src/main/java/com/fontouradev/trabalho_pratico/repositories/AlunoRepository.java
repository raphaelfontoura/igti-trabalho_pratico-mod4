package com.fontouradev.trabalho_pratico.repositories;

import java.util.ArrayList;
import java.util.List;

import com.fontouradev.trabalho_pratico.model.Aluno;

import org.springframework.stereotype.Repository;

@Repository
public class AlunoRepository {

  private final List<Aluno> alunos = new ArrayList<>();

  public List<Aluno> listar() {
    return alunos;
  }

  public void salvar(Aluno aluno) {
    alunos.add(aluno);
  }
  
}
