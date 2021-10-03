package bootstrap.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import bootstrap.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);

    User findByEmail(String email);

    User getUserById(long id);

    // boolean existsById(long id);
}
