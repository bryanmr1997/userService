package com.learnar.userService.security.dto;




import com.learnar.userService.security.enums.State;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.util.Set;


public class NewUser {


    @NotBlank
    private String name;

    @NotBlank
    @Email
    private String email;

    @NotBlank
    private String userName;

    @NotBlank
    private String surname;

    @NotBlank
    private String password;


    private State state;


    private Set<String> roles;


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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public Set<String> getRoles() {
        return roles;
    }

    public void setRoles(Set<String> roles) {
        this.roles = roles;
    }


    public NewUser(String name, String email, String userName, String surname, String password, State state, Set<String> roles) {
        this.name = name;
        this.email = email;
        this.userName = userName;
        this.surname = surname;
        this.password = password;
        this.state = state;
        this.roles = roles;
    }

    public NewUser() {
    }
}
