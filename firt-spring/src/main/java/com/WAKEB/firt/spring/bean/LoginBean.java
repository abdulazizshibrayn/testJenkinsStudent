package com.WAKEB.firt.spring.bean;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LoginBean {

    @JsonProperty("user")
    private String username;

    @JsonProperty("pass")
    private String password;

    public LoginBean(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return " " +
                "username='" + username + '\'' +
                ", password='" + password + '\''
                ;
    }
}
