package com.matchactivities.springbootbackend.dto;


import com.sun.istack.NotNull;
import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

//No caso isso seria um DTO, depois refatorar

@Data
public class RegisterForm {
    @NotBlank
    @NotNull
    @Size(min = 2, max = 30)
    private String name;
    @NotNull
    @NotBlank
    @Email
    private String email;
    // @NotNull
    // @NotBlank
    private String password;
    //private boolean isSpecialist;
    //front end manda essa boolean pra decidir se o usuario tem permissao de profsor ou não
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}