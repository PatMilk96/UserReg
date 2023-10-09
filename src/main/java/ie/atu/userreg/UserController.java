package ie.atu.userreg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    private final UserService us;

    @Autowired
    public UserController(UserService us){
        this.us = us;
    }
    @GetMapping("/registerUser/{name}/{email}")
    public void registerUser(@PathVariable String name, @PathVariable String email){
        us.registerUser(name, email);
    }

    @PostMapping("/confirm")
    public String confirmation(@RequestBody User user){
        return us.confMessage(user);
    }
}
