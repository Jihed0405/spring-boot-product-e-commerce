package polytech.project.productecommerce.service;

import java.util.Optional;

import polytech.project.productecommerce.model.Role;
import polytech.project.productecommerce.model.User;

public interface IUserService {
    User saveUser(User user);

    Optional<User> findByUsername(String username);

    void changeRole(Role newRole, String username);

    Optional<User> findByIdUser(Long id);
}
