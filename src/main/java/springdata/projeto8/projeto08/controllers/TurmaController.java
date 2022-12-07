package springdata.projeto8.projeto08.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springdata.projeto8.projeto08.model.Turma;
import springdata.projeto8.projeto08.repository.TurmaRepository;

@RestController
@RequestMapping("/api/turma")
public class TurmaController {
    @Autowired
    TurmaRepository turmaRepository;

    @GetMapping
    Iterable<Turma> getUsers() {
        return turmaRepository.findAll();
    }

    @PostMapping
    Turma addUser(@RequestBody Turma turma) {
        return turmaRepository.save(turma);
    }
}
