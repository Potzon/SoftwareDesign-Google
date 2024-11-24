package com.example.google;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Credentials {
	@Id
	
	@Column(nullable = false, unique = true)
    private String email;
	
	@Column(nullable = false, unique = false)
    private String password;

    public Credentials() {}


    public Credentials(String email, String password) {
        this.email = email;
        this.password = password;
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

