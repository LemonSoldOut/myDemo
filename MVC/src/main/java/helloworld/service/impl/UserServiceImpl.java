package helloworld.service.impl;

import java.util.List;

import helloworld.dao.UserRepository;
import helloworld.entity.User;
import helloworld.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * user service impl.
 *
 * @author pdai
 */
@Service
public class UserServiceImpl implements UserService {

    /**
     * user dao.
     */
    @Autowired
    private UserRepository userDao;

    /**
     * @param user user
     */
    @Override
    public void addUser(User user) {
        userDao.save(user);
    }

    /**
     * @return user list
     */
    @Override
    public List<User> showUserlist() {
        return userDao.findAll();
    }

}
