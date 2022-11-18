package springdata.projeto8.projeto08.repository;

import org.springframework.data.repository.CrudRepository;

import springdata.projeto8.projeto08.model.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}
