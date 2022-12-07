package springdata.projeto8.projeto08.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import springdata.projeto8.projeto08.model.Aluno;
import springdata.projeto8.projeto08.repository.AlunoRepository;

@RestController
@RequestMapping("/api/aluno")
public class AlunoController {
    @Autowired
    AlunoRepository alunoRepository;

    @GetMapping
    Iterable<Aluno> getUsers() {
        return alunoRepository.findAll();
    }

    @PostMapping
    public Aluno addUser(@RequestBody Aluno aluno) {
        return alunoRepository.save(aluno);
    }
}
