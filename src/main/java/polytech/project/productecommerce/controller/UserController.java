package polytech.project.productecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import polytech.project.productecommerce.model.Role;
import polytech.project.productecommerce.security.UserPrincipal;
import polytech.project.productecommerce.service.IUserService;

import org.springframework.http.HttpStatus;

@RestController
@RequestMapping("api/user")
public class UserController {
    @Autowired
    private IUserService userService;

    @PutMapping("change/{role}")
    public ResponseEntity<?> changeRole(@AuthenticationPrincipal UserPrincipal userPrincipal, @PathVariable Role role) {
        userService.changeRole(role, userPrincipal.getUsername());
        return ResponseEntity.ok(true);
    }

    @GetMapping("{userId}")
    public ResponseEntity<?> changeRole(@AuthenticationPrincipal UserPrincipal userPrincipal,
            @PathVariable Long userId) {

        return new ResponseEntity<>(userService.findByIdUser(userId), HttpStatus.OK);
    }
}
