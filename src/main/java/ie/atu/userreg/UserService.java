package ie.atu.userreg;

public class UserService {
    private EmailService emailService;

    public UserService() {
        this.emailService = new EmailService();
    }

    public void registerUser(String name, String email){
        emailService.sendEmail(email, "Welcome to our platform!");
    }
}
