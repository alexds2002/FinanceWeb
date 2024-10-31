package finance.alex.Finance.service;

import finance.alex.Finance.model.User;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class UserService {
    public List<User> getUsers() {
        return Arrays.asList(
            new User("Alice", 30),
            new User("Bob", 25),
            new User("Charlie", 35)
        );
    }
}
