package polytech.project.productecommerce.service;

import polytech.project.productecommerce.model.User;

public interface IAuthenticationService {
    public User signInAndReturnJWT(User signInRequest);
}
