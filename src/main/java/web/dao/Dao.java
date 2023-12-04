package web.dao;

import web.model.User;

import java.util.List;

public interface Dao {
    User getUser(Integer id);

    List<User> getUsers();

    void createUser(User user);

    void updateUser(User user);

    void deleteUser(User user);

}