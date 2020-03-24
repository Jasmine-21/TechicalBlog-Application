package technicalblog.service;

import technicalblog.dao.UserDao;
import technicalblog.model.User;

public class UserService {
    private UserDao userDao=new UserDao();
    public boolean isValidUser(User user)
    {
        return userDao.isValidUser(user);
    }
}
