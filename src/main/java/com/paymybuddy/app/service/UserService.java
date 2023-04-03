package com.paymybuddy.app.service;

import com.paymybuddy.app.model.User;
import com.paymybuddy.app.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public Iterable<User> getUsers(){
        return userRepository.findAll();
    }

    public User addUser(User user) {
        return userRepository.save(user);
    }

    public void deleteUserById(Integer id) {
        userRepository.deleteById(id);
    }

}
