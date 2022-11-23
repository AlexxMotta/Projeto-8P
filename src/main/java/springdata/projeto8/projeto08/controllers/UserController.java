package springdata.projeto8.projeto08.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import springdata.projeto8.projeto08.model.User;
import springdata.projeto8.projeto08.repository.UserRepository;

@RestController
@RequestMapping("/users")
public class UserController {

    // GET
    // POST
    // PUT
    // DELETE
    // PATCH

    // injetando automaticamente o repository dentro do controller
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/{id}")
    public User user(@PathVariable("id") Long id) {
        // filtra o array de users com a condição de o user.id == id,
        // pengando apenas a primeira ocorrencia
        Optional<User> userFind = this.userRepository.findById(id);

        if (userFind.isPresent()) {
            System.out.println(userFind);
            return userFind.get();
        }
        return null;
    }

    @PostMapping("/add")
    public User user(@RequestBody User user) {
        return this.userRepository.save(user);
    }

    @GetMapping("/list")
    public List<User> list() {
        return this.userRepository.findAll();
    }

    @GetMapping("/list/{id}")
    public List<User> listMoreThan(@PathVariable("id") Long id) {
        return this.userRepository.findAllMoreThan(id);
    }

    @GetMapping("/findByName/{name}")
    public List<User> findByName(@PathVariable("name") String name) {
        return this.userRepository.findByNameIgnoreCase(name);
    }

}
