package com.example.ussa.payload;

import javax.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;

public class SignUpRequest {
    @NotBlank
    @Size(min = 4, max = 40)
    @Getter
    @Setter
    private String name;

    @NotBlank
    @Size(min = 3, max = 15)
    @Getter
    @Setter
    private String username;

    @NotBlank
    @Size(max = 40)
    @Email
    @Getter
    @Setter
    private String email;

    @NotBlank
    @Size(min = 6, max = 20)
    @Getter
    @Setter
    private String password;


}