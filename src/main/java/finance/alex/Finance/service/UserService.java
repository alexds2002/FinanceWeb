package finance.alex.Finance.service;

import finance.alex.Finance.model.User;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    private List<User> users = new ArrayList<>(List.of(
            new User("Alice", 30),
            new User("Bob", 25),
            new User("Charlie", 35)));

    public List<User> getUsers() {
        return users;
    }

    public void addUser(User user) {
        users.add(user);
    }

    public boolean authenticateUser(String username, String password) {
        // Basic authentication check - username and password match
        return username.equals(password);
    }
}
