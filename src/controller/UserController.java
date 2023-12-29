package controller;

import model.User;
import service.IUserService;
import service.UserService;

import java.util.List;

public class UserController {
    private final IUserService iUserService=new UserService();


    public List<User> add() {

        return iUserService.add();
    }

    public void findNo(User user) {
        iUserService.findNo(user);
    }

    public User searchUser(String code) {

        return iUserService.searchUser(code);
    }

    public User searchUser1(String name) {
        return iUserService.searchUser1(name);
    }
}
