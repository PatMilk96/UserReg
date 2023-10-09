package ie.atu.userreg;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private final UserService us;

    public UserController(){
        this.us = new UserService();
    }
    @GetMapping("/registerUser/{name}/{email}")
    public void registerUser(@PathVariable String name, @PathVariable String email){
        us.registerUser(name, email);
    }
}
