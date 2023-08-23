package com.example.repositories;

import com.example.models.User;

import io.quarkus.hibernate.reactive.panache.PanacheRepository;
import io.quarkus.hibernate.reactive.panache.common.WithSession;
import jakarta.enterprise.context.ApplicationScoped;

@WithSession
@ApplicationScoped
public class UserRepository implements PanacheRepository<User>{
    
}
