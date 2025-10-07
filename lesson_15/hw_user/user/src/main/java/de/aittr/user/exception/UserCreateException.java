package de.aittr.user.exception;

import de.aittr.user.model.User;

public class UserCreateException extends RuntimeException {
    public UserCreateException (User user) {
        super(user.toString());
    }
}
