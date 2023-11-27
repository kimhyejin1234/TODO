package com.example.todo.userapi.dto.request;

import lombok.*;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Setter @Getter
@ToString @NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Builder
public class LoginRequestDTO {

    @NotBlank
    @Email
    private String email;

    @NotBlank
    private String password;


}