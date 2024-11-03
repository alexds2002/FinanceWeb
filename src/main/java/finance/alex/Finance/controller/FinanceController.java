package finance.alex.Finance.controller;

import finance.alex.Finance.model.User;
import finance.alex.Finance.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

    @PostMapping("/addUser")
    public String addUser(@RequestParam String name, @RequestParam int age) {
        User newUser = new User(name, age);
        userService.addUser(newUser);
        return "redirect:/home"; // Redirects back to the list after adding
    }
}
