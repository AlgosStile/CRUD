package com.example.demo.controllers;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    /**
     * Извлекает всех пользователей и добавляет их в модель.
     *
     * @param model модель для добавления пользователей
     * @return имя представления для отображения списка пользователей
     */
    @GetMapping("/users")
    public String findAll(Model model) {
        List<User> users = userService.findAll();
        model.addAttribute("users", users);
        return "user-list";
    }

    /**
     * Отображает форму создания пользователя.
     *
     * @param user объект пользователя, который будет привязан к форме
     * @return the имя представления для отображения формы создания пользователя
     */
    @GetMapping("/user-create")
    public String createUserForm(User user) {
        return "user-create";
    }

    /**
     * Creates a new user.
     *
     * @param user объект пользователя, который необходимо создать
     * @return имя представления для перенаправления в список пользователей
     */
    @PostMapping("/user-create")
    public String createUser(User user) {
        userService.saveUser(user);
        return "redirect:/users";
    }

    /**
     * Удаляет пользователя по ID.
     *
     * @param id ID пользователя, которого нужно удалить
     * @return имя представления для перенаправления в список пользователей
     */
    @GetMapping("/user-delete/{id}")
    public String deleteUser(@PathVariable("id") int id) {
        userService.deleteById(id);
        return "redirect:/users";
    }

    /**
     * Отображает форму обновления пользователя.
     *
     * @param id    идентификатор пользователя, который будет обновлен
     * @param model модель, в которую нужно добавить пользователя
     * @return имя представления для отображения формы обновления пользователя
     */
    @GetMapping("/user-update/{id}")
    public String showUpdateForm(@PathVariable("id") int id, Model model) {
        User user = userService.getUserById(id);
        model.addAttribute("user", user);
        return "user-update";
    }

    /**
     * Обновляет пользователя.
     *
     * @param user объект пользователя, который необходимо обновить
     * @return имя представления для перенаправления в список пользователей
     */
    @PostMapping("/user-update")
    public String updateUser(User user) {
        userService.updateUser(user);
        return "redirect:/users";
    }
}