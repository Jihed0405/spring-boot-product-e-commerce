package polytech.projectsem2.productecommerce.service;

import java.util.Optional;

import polytech.projectsem2.productecommerce.model.Role;
import polytech.projectsem2.productecommerce.model.User;

public interface UserService {
    User saveUser(User user);
    Optional<User> findByUsername(String username);
    void changeRole(Role newRole, String username);
}
