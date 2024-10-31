package finance.alex.Finance;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FinanceController {

    @GetMapping("/home")
    public String home() {
        return "index"; // Looks for `index.html` in `static` directory, or `index` in `templates` if using Thymeleaf
    }
}
