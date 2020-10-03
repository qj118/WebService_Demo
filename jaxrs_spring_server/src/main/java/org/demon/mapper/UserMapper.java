package org.demon.mapper;

import org.demon.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {

    User findById(Integer id);

    List<User> findAll();

    void addOne(User user);

    void deleteOne(Integer id);

    void updateOne(User user);
}
