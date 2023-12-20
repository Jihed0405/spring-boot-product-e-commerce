package polytech.project.productecommerce.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import polytech.project.productecommerce.model.Role;
import polytech.project.productecommerce.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

    // find user by username (function is already exists)
    Optional<User> findByUsername(String username);

    // we want to hav a custom function to change role in user table by having his
    // username
    @Modifying
    @Query("update User set role = :role where username = :username")
    void updateUserRole(@Param("username") String username, @Param("role") Role role);
}
