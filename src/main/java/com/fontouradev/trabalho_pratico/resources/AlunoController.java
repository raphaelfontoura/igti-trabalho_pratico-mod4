package com.fontouradev.trabalho_pratico.resources;

import java.util.List;

import com.fontouradev.trabalho_pratico.model.Aluno;
import com.fontouradev.trabalho_pratico.repositories.AlunoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

  @Autowired
  private AlunoRepository repository;
  
  @GetMapping
  public ResponseEntity<List<Aluno>> getAlunos() {
    var alunos = repository.listar();
    if (alunos.isEmpty()) {
      return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    return new ResponseEntity<List<Aluno>>(repository.listar(), HttpStatus.OK);
  }

  @PostMapping
  public ResponseEntity<Void> setAluno(@RequestBody Aluno aluno) {
    repository.salvar(aluno);
    return new ResponseEntity<Void>(HttpStatus.CREATED);
  }

}
