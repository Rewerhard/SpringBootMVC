package net.myapp.springbootmvc.service;

import net.myapp.springbootmvc.model.User;

import java.util.List;

public interface UserService {
    List<User> getUsers();

    void add(User user);

    void update(User user);

    User getUserById(Long id);

    void deleteUserById(Long id);
}
