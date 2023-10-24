package net.myapp.springbootmvc.dao;

import net.myapp.springbootmvc.model.User;

import java.util.List;

public interface UserDao {
    List<User> getUsers();

    void add(User user);

    void update(User user);

    User getUserById(Long id);

    void deleteUserById(Long id);

}
