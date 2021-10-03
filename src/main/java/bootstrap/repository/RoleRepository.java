package bootstrap.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import bootstrap.model.Role;


public interface RoleRepository extends JpaRepository<Role, Long> {

    Role findByName(String role);

}