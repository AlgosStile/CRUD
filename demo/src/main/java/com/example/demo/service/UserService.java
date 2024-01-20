package com.example.demo.service;

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

    /**
     * Возвращает список всех пользователей.
     *
     * @return список пользователей
     */
    public List<User> findAll() {
        return userRepository.findAll();
    }

    /**
     * Сохраняет пользователя.
     *
     * @param user пользователь для сохранения
     * @return сохраненный пользователь
     */
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    /**
     * Удаляет пользователя по идентификатору.
     *
     * @param id идентификатор пользователя
     */
    public void deleteById(int id) {
        userRepository.deleteById(id);
    }

    /**
     * Возвращает пользователя по идентификатору.
     *
     * @param id идентификатор пользователя
     * @return пользователь
     */
    public User getUserById(int id) {
        return userRepository.findById(id);
    }

    /**
     * Обновляет информацию о пользователе.
     *
     * @param user пользователь для обновления
     */
    public void updateUser(User user) {
        userRepository.update(user);
    }
}