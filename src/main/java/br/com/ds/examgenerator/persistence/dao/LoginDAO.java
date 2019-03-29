package br.com.ds.examgenerator.persistence.dao;

import br.com.ds.examgenerator.persistence.model.Token;
import org.springframework.web.client.RestTemplate;

import javax.inject.Inject;
import java.io.Serializable;

/**
 * @author Douglas Souza on 29/03/2019
 */
public class LoginDAO implements Serializable {
    private final String BASE_URL = "http://localhost:8085/login";
    private final RestTemplate restTemplate;

    @Inject
    public LoginDAO(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Token loginReturningToken(String username, String password) {
    }

    public String addQuotes(String value) {
        return new StringBuilder(300).append("\"").append(value).append("\"").toString();
    }
}
