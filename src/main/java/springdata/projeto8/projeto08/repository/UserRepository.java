package springdata.projeto8.projeto08.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import springdata.projeto8.projeto08.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
}
