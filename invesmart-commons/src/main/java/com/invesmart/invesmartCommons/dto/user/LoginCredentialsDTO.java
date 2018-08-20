package com.invesmart.invesmartCommons.dto.user;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;

public class LoginCredentialsDTO implements Serializable{

    private String username;
    private String password;
    private String ip;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String sessionID;


    public LoginCredentialsDTO() { }

    public LoginCredentialsDTO(String username, String password, String ip) {
        this.username = username;
        this.password = password;
        this.ip = ip;
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

    public String getSessionID() {
        return sessionID;
    }

    public void setSessionID(String sessionID) {
        this.sessionID = sessionID;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
}
