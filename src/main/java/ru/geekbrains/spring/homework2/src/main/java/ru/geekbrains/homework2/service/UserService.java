package ru.geekbrains.homework2.service;

import org.springframework.stereotype.Service;
import ru.geekbrains.homework2.model.User;
import ru.geekbrains.homework2.repository.UserRepository;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> findAll(){
        return userRepository.findAll();
    }

    public User saveUser(User user){
        return userRepository.save(user);
    }

    // Homework 2
    public void deleteById(int id) {
        userRepository.deleteById(id);
    }

}
