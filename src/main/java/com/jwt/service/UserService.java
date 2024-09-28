package com.jwt.service;

import com.jwt.models.User;
import org.springframework.stereotype.Service;

import java.rmi.server.UID;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    private List<User> store = new ArrayList<>();

    public UserService(){
        store.add(new User(UUID.randomUUID().toString(), "Rashid", "mdrashid@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(), "Asif", "asif@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(), "Danish", "asif@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(), "Shakil", "asif@gmail.com"));
    }

    public List<User> getUser(){
        List<User> store = new ArrayList<>();
        return this.store;
    }
}
