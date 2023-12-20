package polytech.project.productecommerce.security.jwt;

import javax.servlet.http.HttpServletRequest;

import org.springframework.security.core.Authentication;

import polytech.project.productecommerce.security.UserPrincipal;

public interface JwtProvider {
    public String generateToken(UserPrincipal auth);

    public Authentication getAuthentication(HttpServletRequest request);

    public boolean isTokenValid(HttpServletRequest request);
}
