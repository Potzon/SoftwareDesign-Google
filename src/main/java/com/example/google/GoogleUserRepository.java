package com.example.google;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GoogleUserRepository extends JpaRepository<Credentials, String> {

    Credentials findByEmail(String email);
}

