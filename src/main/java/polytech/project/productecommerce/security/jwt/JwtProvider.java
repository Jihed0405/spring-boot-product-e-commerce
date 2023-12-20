package polytech.project.productecommerce.security.jwt;

import org.springframework.security.core.Authentication;

import jakarta.servlet.http.HttpServletRequest;
import polytech.project.productecommerce.security.UserPrincipal;

public interface JwtProvider {
    public String generateToken(UserPrincipal auth);

    public Authentication getAuthentication(HttpServletRequest request);

    public boolean isTokenValid(HttpServletRequest request);
}
