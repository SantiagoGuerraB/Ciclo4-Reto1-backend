
package Reto1Ciclo4.Reto1.repository.crud;

import Reto1Ciclo4.Reto1.Model.User;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;


public interface UserCrudRepository extends CrudRepository<User, Integer> {
    Optional<User> findByEmail(String email);
    Optional<User> findByEmailAndPassword(String email,String password);
}