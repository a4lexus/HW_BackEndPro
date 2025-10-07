package de.aittr.user.dto;

import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class UserResponseDto {
    private Long id;
    private String name;
    private String email;

}
