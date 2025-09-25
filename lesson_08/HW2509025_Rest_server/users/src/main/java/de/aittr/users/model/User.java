package de.aittr.users.model;

import java.util.Objects;

public class User {
    private String username;
    private String login;
    private int idNumber;
    private String email;

    public User(String username, String login, int idNumber, String email) {
        this.username = username;
        this.login = login;
        this.idNumber = idNumber;
    }

    public User() {
    }

    public String getUsername() {
        return username;
    }

    public String getLogin() {
        return login;
    }

    public int getIdNumber() {
        return idNumber;
    }
    public String getEmail() {
        return email;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return idNumber == user.idNumber && Objects.equals(login, user.login);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, idNumber);
    }
}
