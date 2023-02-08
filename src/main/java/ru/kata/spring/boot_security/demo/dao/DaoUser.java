package ru.kata.spring.boot_security.demo.dao;

import ru.kata.spring.boot_security.demo.entity.User;

import java.util.List;

public interface DaoUser {

    List<User> getAllUsers();

    void addUser(User user);

    User getUserById(Integer id);

    void update(Integer id, User user);

    void delete(Integer id);
}
