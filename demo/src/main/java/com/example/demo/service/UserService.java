package com.example.demo.service;

import com.example.demo.action.TrackUserAction;
import com.example.demo.model.User;
import com.example.demo.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Класс-сервис для работы с пользователями.
 */
@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    @TrackUserAction
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @TrackUserAction
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @TrackUserAction
    public void deleteById(int id) {
        userRepository.deleteById(id);
    }

    @TrackUserAction
    public User getUserById(int id) {
        return userRepository.findById(id);
    }

    @TrackUserAction
    public void updateUser(User user) {
        userRepository.update(user);
    }
}