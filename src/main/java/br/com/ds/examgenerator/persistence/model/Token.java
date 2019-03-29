package br.com.ds.examgenerator.persistence.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;

/**
 * @author Douglas Souza on 29/03/2019
 */
public class Token {

    private String token;

    @JsonProperty("exp")
    private LocalDateTime expirationTime;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public LocalDateTime getExpirationTime() {
        return expirationTime;
    }

    public void setExpirationTime(LocalDateTime expirationTime) {
        this.expirationTime = expirationTime;
    }
}
