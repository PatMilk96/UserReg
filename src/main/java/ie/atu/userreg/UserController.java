package ie.atu.userreg;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private UserService us;
    @GetMapping("/registerUser/{name}/{email}")
    public UserController register(@PathVariable int name, @PathVariable int email){

        return null;
    }
}
