package br.com.maciel.vagas.modules.candidate.controller;

import br.com.maciel.vagas.modules.candidate.CandidateEntity;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/candidate")
public class CandidateController {

  @PostMapping("/create")
  public ResponseEntity<Object> create(@Valid @RequestBody CandidateEntity candidateEntity) {
    return ResponseEntity.status(HttpStatus.CREATED).body("Candidate created.");
  }
}
