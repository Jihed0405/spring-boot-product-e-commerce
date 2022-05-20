package polytech.projectsem2.productecommerce.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import polytech.projectsem2.productecommerce.model.Role;
import polytech.projectsem2.productecommerce.security.UserPrincipal;
import polytech.projectsem2.productecommerce.service.UserService;
import org.springframework.http.HttpStatus;

@RestController
@RequestMapping("api/user")
public class UserController
{   @Autowired
    private UserService userService;
   
    @PutMapping("change/{role}")
    public ResponseEntity<?> changeRole(@AuthenticationPrincipal UserPrincipal userPrincipal,@PathVariable Role role)
    {
        userService.changeRole(role,userPrincipal.getUsername());
        return ResponseEntity.ok(true);
    }
    @GetMapping("{userId}")
    public ResponseEntity<?> changeRole(@AuthenticationPrincipal UserPrincipal userPrincipal,@PathVariable Long userId)
    {
      
        return new ResponseEntity<>(userService.findByIdUser(userId), HttpStatus.OK);
    }
}
