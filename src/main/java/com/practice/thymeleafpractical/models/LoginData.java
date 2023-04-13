package com.practice.thymeleafpractical.models;

import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class LoginData {

    // server side form validation using bean validator and hibernate validator
    // dependency
    @NotBlank(message = "Username can not be empty")
    @Size(min = 3, max = 12, message = "Username must be between 3 - 12 characters")
    private String userName;

    @Email(regexp = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$")
    private String email;

    // if error hoga to chalega ye
    @AssertTrue(message = "Must be agree terms and conditions")
    private boolean agreed;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "LoginData [userName=" + userName + ", email=" + email + "]";
    }

    public boolean isAgreed() {
        return agreed;
    }

    public void setAgreed(boolean agreed) {
        this.agreed = agreed;
    }

}
