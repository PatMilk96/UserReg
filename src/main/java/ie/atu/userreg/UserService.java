package ie.atu.userreg;


import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final EmailService emailService;

    public UserService(EmailService emailService) {
        this.emailService = emailService;
    }


    public void registerUser(String name, String email){
        emailService.sendEmail(email, "Welcome to our platform!");
    }

    public String confMessage(User user){
         return "User " + user.getName() + " registered with email: " + user.getEmail();
    }

}
