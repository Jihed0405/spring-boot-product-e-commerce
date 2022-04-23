package polytech.projectsem2.productecommerce.service;

import polytech.projectsem2.productecommerce.model.User;

public interface AuthenticationService {
    public User signInAndReturnJWT(User signInRequest) ;
}
