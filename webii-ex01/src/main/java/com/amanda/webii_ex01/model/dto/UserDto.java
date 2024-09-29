package com.amanda.webii_ex01.model.dto;

import lombok.Data;
import org.antlr.v4.runtime.misc.NotNull;

@Data
public class UserDto {
    @NotNull
    private String firstName;

    @NotNull
    private String lastName;

    @NotNull
    private String password;
    private String matchingPassword;

    @NotNull
    private String email;

    // standard getters and setters
}