package de.aittr.user.dto;

import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class UserRequestDto {
    private String name;
    private String email;
    private String password;
}
