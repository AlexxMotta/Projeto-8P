package springdata.projeto8.projeto08.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import springdata.projeto8.projeto08.model.User;
import springdata.projeto8.projeto08.repository.UserRepository;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping
    Iterable<User> getUsers() {
        return userRepository.findAll();
    }

    @PostMapping
    User addUser(@RequestBody User user) {
        return userRepository.save(user);
    }
}
