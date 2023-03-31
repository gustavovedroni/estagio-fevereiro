package com.estagio.persisti.services;

import com.estagio.persisti.entities.User;
import com.estagio.persisti.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    public List<User> findAll(){
        return repository.findAll();
    }
}

