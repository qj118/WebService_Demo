package org.demon.service.impl;

import org.demon.entity.User;
import org.demon.mapper.UserMapper;
import org.demon.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper mapper;

    @Override
    public void saveUser(User user) {
        System.out.println("save user: " + user);
        mapper.addOne(user);
    }

    @Override
    public void updateUser(User user) {
        System.out.println("update user: " + user);
        mapper.updateOne(user);
    }

    @Override
    public List<User> findAllUsers() {
        System.out.println("find all users ...");
        return mapper.findAll();
    }

    @Override
    public User findUserById(Integer id) {
        System.out.println("find user by id: " + id);
        return mapper.findById(id);
    }

    @Override
    public void deleteUser(Integer id) {
        System.out.println("delete user by id: " + id);
        mapper.deleteOne(id);
    }
}
