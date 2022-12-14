package springdata.projeto8.projeto08.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import springdata.projeto8.projeto08.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

    @Query("SELECT u from User u where u.id > :id")
    public List<User> findAllMoreThan(@Param("id") Long id);

    public List<User> findByNameIgnoreCase(String name);

}
