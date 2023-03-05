package com.learnar.userService.security.dto;


import javax.validation.constraints.NotBlank;




public class LoginUser {


    @NotBlank
    private String userName;

    @NotBlank
    private String password;


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public LoginUser(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public LoginUser() {
    }
}
