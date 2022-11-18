package springdata.projeto8.projeto08.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import springdata.projeto8.projeto08.model.Disciplina;
import springdata.projeto8.projeto08.repository.DisciplinaRepository;

@RestController
@RequestMapping("/api/disciplina")
public class DisciplinaController {
    @Autowired
    DisciplinaRepository disciplinaRepository;

    @GetMapping
    Iterable<Disciplina> getUsers() {
        return disciplinaRepository.findAll();
    }

    @PostMapping
    Disciplina addUser(@RequestBody Disciplina disciplina) {
        return disciplinaRepository.save(disciplina);
    }
}
