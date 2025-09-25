package de.aittr.users.lists;

import de.aittr.users.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    private static final List<User> USERS = List.of(
            new User("Max", "Maximus", 7, "max@mai.com"),
            new User("Tom", "Tomson", 5,"tom@mail.com"),
            new User("Kim", "Kim-chi", 9, "kim@mail.com"),
            new User("Poll", "Pollin", 2,"poll@mail.com")
    );

    @GetMapping("/idNumber")
    public List<User> getIdNumber() {
        return USERS;
    }

    @GetMapping("/idNumber/{login}")
    public User getIdNumber(@PathVariable String login) {
        return USERS.stream()
                .filter(u -> u.getLogin().equalsIgnoreCase(login))
                .findFirst()
                .get();
    }

}