package com.codegym.service;

import com.codegym.model.authentication.User;
import com.codegym.repository.authentication.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService{
    @Autowired
    private IUserRepository userRepository;
    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }
}
