package finance.alex.Finance.controller;

import finance.alex.Finance.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/*
 * Works as the controller in the MVC architecture
 * Handles requests and direct them to the view with any necessary data.
 */
@Controller
public class FinanceController {

    private final UserService userService;

    @Autowired
    public FinanceController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("users", userService.getUsers());
        return "home"; // This corresponds to `home.html` in the `templates` folder
    }
}
