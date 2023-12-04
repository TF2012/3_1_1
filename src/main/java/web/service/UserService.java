package web.service;

import web.model.User;

import java.util.List;

public interface UserService {

    User getUser(Integer id);


    List<User> getUsers();


    void createUser(User user);


    void updateUser(User user);

    void deleteUser(User user);
}
