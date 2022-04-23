package polytech.projectsem2.productecommerce.security.jwt;

import javax.servlet.http.HttpServletRequest;

import org.springframework.security.core.Authentication;

import polytech.projectsem2.productecommerce.security.UserPrincipal;



public interface JwtProvider {
    public String generateToken(UserPrincipal auth) ;
    public Authentication getAuthentication(HttpServletRequest request);
    public boolean isTokenValid(HttpServletRequest request);
}
