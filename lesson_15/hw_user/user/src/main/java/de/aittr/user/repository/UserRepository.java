package de.aittr.user.repository;

import de.aittr.user.dto.UserRequestDto;
import de.aittr.user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository  extends JpaRepository<User, Long> {
    List<User> findAll();
    List<User> findByName(String name);
    List<User> findByEmail(String email);
    Optional<User> findById(Long id);
    User save(User user);


}
