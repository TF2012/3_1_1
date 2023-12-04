package web.service;
import org.springframework.stereotype.Service;
import web.model.User;
import web.dao.Dao;

import org.springframework.transaction.annotation.Transactional;

import java.lang.annotation.Annotation;
import java.util.List;

@Service
public class ServiceImpl implements UserService {
    private final Dao dao;

    public ServiceImpl(Dao dao) {
        this.dao = dao;
    }

    @Transactional(readOnly = true)
    @Override
    public User getUser(Integer id) {
        return dao.getUser(id);
    }

    @Transactional(readOnly = true)
    @Override
    public List<User> getUsers() {
        return dao.getUsers();
    }

    @Transactional
    @Override
    public void createUser(User user) {
        dao.createUser(user);
    }

    @Transactional
    @Override
    public void updateUser(User user) {
        dao.updateUser(user);
    }

    @Transactional
    @Override
    public void deleteUser(User user) {
        dao.deleteUser(user);
    }

}