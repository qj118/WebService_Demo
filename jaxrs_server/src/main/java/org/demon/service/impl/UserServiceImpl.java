package org.demon.service.impl;

import org.demon.entity.Car;
import org.demon.entity.User;
import org.demon.service.UserService;

import java.util.ArrayList;
import java.util.List;


public class UserServiceImpl implements UserService {
    @Override
    public void saveUser(User user) {
        System.out.println("save user: " + user);
    }

    @Override
    public void updateUser(User user) {
        System.out.println("update user: " + user);
    }

    @Override
    public List<User> findAllUsers() {
        List<User> users = new ArrayList<>();
        List<Car> cars = new ArrayList<>();

        Car car1 = new Car(101,"保时捷", 1000000d);
        Car car2 = new Car(102, "宝马", 100000d);
        cars.add(car1);
        cars.add(car2);

        User user1 = new User(1, "JIA", "Shanghai", cars);
        User user2 = new User(2, "FEI", "Beijing", null);
        users.add(user1);
        users.add(user2);

        return users;
    }

    @Override
    public User findUserById(Integer id) {
        if(id == 1){
            User user1 = new User(1, "JIA", "Shanghai", null);
            return user1;
        }
        if(id == 2){
            User user2 = new User(2, "FEI", "Beijing", null);
            return user2;
        }
        return null;
    }

    @Override
    public void deleteUser(Integer id) {
        System.out.println("delete user id: " + id);
    }
}
