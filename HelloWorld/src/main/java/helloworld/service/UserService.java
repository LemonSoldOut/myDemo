package helloworld.service;

import helloworld.entity.User;

import java.util.List;

public interface UserService {
    void addUser(User user);

    List<User> showUserlist();
}
