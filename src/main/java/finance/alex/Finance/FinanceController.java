package finance.alex.Finance;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FinanceController {

    @GetMapping("/greetings")
    String home() {
        return "Hello world";
    }
}
