package technicalblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import technicalblog.dao.UserDao;
import technicalblog.model.User;
import technicalblog.service.UserService;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class UserController {

    //localhost:3200/users/login
    @RequestMapping("users/login")
    public String login() {
        return "users/login";
    }
    @RequestMapping("users/registration")
    public String registration() {
        return "users/registration";
    }
    @RequestMapping(value = "users/login", method = RequestMethod.POST)
    public String loginUser(User user) {

        UserService u=new UserService();
        boolean flag=u.isValidUser(user);
        if(flag)
        {
            return "redirect:/posts";
        }
        else {
            return "users/login";
        }
    }


}
