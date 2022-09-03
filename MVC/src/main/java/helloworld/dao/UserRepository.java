package helloworld.dao;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import helloworld.entity.User;
import org.springframework.stereotype.Repository;

/**
 * @author pdai
 */
@Repository
public class UserRepository {

    private List<User> userDemoList = new ArrayList<>();

    public void save(User user) {
        userDemoList.add(user);
    }

    public List<User> findAll() {
        return userDemoList;
    }
}
