package repository;

import model.User;

import java.util.List;

public interface IUserRepository {
    List<User> add();

    void findNo(User user);

    User searchUser(String code);

    User searchUser1(String name);

}
